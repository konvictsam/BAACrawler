package com.webcrawler.spider;

import static com.webcrawler.utilities.SpiderUtility.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 * @author Sameer Gaware
 *
 */
public abstract class SeleniumSpider extends Spider {

	private String chromeDriverPath = null;  
	private WebDriver driver = null;
	private WebDriver webDrivers[] = null; 
	private Drivers currentDriver = null; 
	private ChromeOptions options = null;
	private File cacheFilePath = null;
	private File cacheFile = null;

	public SeleniumSpider() {
		currentDriver = Drivers.HEADLESSCHROME;
	}

	@Override
	public void setName(String name) {
		NAME = name;
	}

	/**
	 * 
	 * @param currentDriver
	 */
	public void setDriver(Drivers currentDriver, String chromeDriverPath)
	{
		this.chromeDriverPath = chromeDriverPath;
		this.currentDriver = currentDriver;
	}

	@Override
	public String getBody(String url) {
		driver.get(startLink);
		String body = driver.getPageSource();
		return body;
	}

	/**
	 * Creates all necessary objects for SeleniumSpider. 
	 * Avoid Overriding this method, if you override it then make sure you call super.preparePhase() 
	 */
	@Override
	public void preparePhase()  {

		try {

			linksToVisit = new ConcurrentLinkedQueue<String>();
			linksToVisit.add(startLink); 
			dataLinkQueue = new ConcurrentLinkedQueue<String>();
			cacheFilePath = getCacheDirectory();
			linkToCache = new ConcurrentHashMap<>(); 
			visitedLinks = new ConcurrentSkipListSet<>();
			webDrivers = new WebDriver[threadCount];

			cacheFile = new File(cacheFilePath,"cache.dat");
			if(cacheFile.exists()) {
				populateCacheMap(cacheFile); 
			}

			System.out.println("Inside Headless chrome");

			System.setProperty("webdriver.chrome.driver", chromeDriverPath);  
			options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

			driver = new ChromeDriver(options);

			for(int index = 1 ; index<=threadCount ; index++) {
				webDrivers[index-1] = new ChromeDriver(options);
			}

		}catch(Exception  e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads the cache file if available already and populate the information into map which is further used to avoid multiple caching of pages
	 * @param cacheFile
	 * @throws IOException
	 */
	private void populateCacheMap(File cacheFile) throws IOException { 

		Files.readAllLines(cacheFile.toPath()).stream().forEach(element -> {
			if(!nullOrEmpty(element) && element.contains("`")) {
				String arr[] = element.split("`");
				linkToCache.put(arr[0], arr[1]);
			}
		});

		/*creating a TreeSet and populating it with cache file names(in number format)*/
		TreeSet<Integer> sortedCacheList = new TreeSet<>();
		linkToCache.values().stream().forEach(element -> {
			sortedCacheList.add(Integer.parseInt(element.replaceAll("\\.html", "")));
		});

		/*setting the cache count value to highest cache number*/
		cacheCount = sortedCacheList.last();
	}

	@Override
	public void postPhase(String url, String body) {
		// TODO Auto-generated method stub 

	}

	/**
	 * It is used to close all opened resources
	 */
	@Override
	public void cleanUpPhase() {

		for(int index = 0 ; index < threadCount ; index++) {
			WebDriver wdr = webDrivers[index];
			wdr.close();
			wdr.quit();
		}
		driver.close();
		driver.quit();
	}

	@Override
	public List<String> extractURLPhase(String url, String body) {
		// TODO Auto-generated method stub
		return extractURLPhase(url, body,null);
	}

	public List<String> extractURLPhase(String url, String body, WebDriver webDriver) {

		List<String> links = new ArrayList<>();

		if(webDriver == null)
			return links;

		if(skipExtractLinkPhase)
			return links; 

		if(!setExtractLinkFromDataPage && isDataPage(url))
			return links;

		webDriver.get(url); 
		System.out.println("Extracting link from : "+url); 

		List<WebElement> allElements = webDriver.findElements(By.tagName("a"));
		if(!nullOrEmpty(allElements)) {
			for(WebElement webElement : allElements) {
				String link = webElement.getAttribute("href");
				link = normalizeURL(link);

				if(nullOrEmpty(link))
					continue;
				if((isDataPage(link) || isTraversalPage(link)) && !visitedLinks.contains(link)) {
					links.add(link);
					visitedLinks.add(link);
					System.out.println("	"+link); 
				}
			}
		}
		return links;
	}

	private void extractURLPhase() throws InterruptedException {
		for(int index = 0 ; index < threadCount ; index++) {
			WebDriver wdr = webDrivers[index]; 

			executorService.submit(() -> {
				while(!linksToVisit.isEmpty()) {
					String link = linksToVisit.peek();
					System.out.println("Thread : "+Thread.currentThread()); 
					List<String> links = extractURLPhase(link, null, wdr);
					if(!nullOrEmpty(links)) {
						List<String> traversalLinks = links.stream().filter(element -> isTraversalPage(element)).collect(Collectors.toList());
						List<String> dataLinks = links.stream().filter(element1 -> isDataPage(element1)).collect(Collectors.toList());

						dataLinks.stream().forEach(element1 -> {
							if(!linkToCache.containsKey(element1))
								linkToCache.put(element1, "");

						}); 

						linksToVisit.addAll(traversalLinks);
					}
					System.out.println("Removing "+link+" from queue "+linksToVisit.size()+" "); 
					linksToVisit.poll();
				}
			});
		}

		executorService.shutdown();
		executorService.awaitTermination(1,TimeUnit.DAYS); 
		System.out.println("Shutting down executor service Caught "+linkToCache.size()+" data pages");
	}

	@Override
	public void start(String startLink, int threadCount) {

		this.startLink = startLink;
		this.threadCount = threadCount;
		executorService = Executors.newFixedThreadPool(threadCount);

		switch (currentDriver) {
		case HEADLESSCHROME: {

			try {
				preparePhase(); 
				extractURLPhase();
				mainPhase();

				System.out.println("Finished Extract link phase"+cacheCount);

			} catch (Exception e){
				e.printStackTrace();
			}
		}

		break;
		case CHROME: {

		}
		break;
		}
	}

	private void mainPhase() throws InterruptedException, IOException {

		//add data links in dataLinkQueue for processing
		executorService = Executors.newFixedThreadPool(threadCount);
		dataLinkQueue.addAll(linkToCache.keySet());


		for(int index = 0 ; index < threadCount ; index++) {

			WebDriver wdr = webDrivers[index]; 

			executorService.submit(() -> {
				while(!dataLinkQueue.isEmpty()) {
					String link = dataLinkQueue.poll();

					String pageSource = getBody(link,wdr);
					try {

						if(nullOrEmpty(linkToCache.get(link))) {
							int currentCacheCount = ++cacheCount;
							Files.write(Paths.get(cacheFilePath.getAbsolutePath(),"/"+currentCacheCount+".html"), pageSource.getBytes());
							linkToCache.put(link, currentCacheCount+".html");
						}

					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("Main Phase using "+Thread.currentThread().getName()+" ` "+link+" remaining "+dataLinkQueue.size()+" "); 
				} 
			});
		}

		executorService.shutdown();
		executorService.awaitTermination(1,TimeUnit.DAYS);

		BufferedWriter br = new BufferedWriter(new FileWriter(new File(cacheFilePath, "cache.dat"))); 
		for(String key : linkToCache.keySet()) {
			br.write(key+"`"+linkToCache.get(key)); 
			br.newLine();
		}

		br.flush();
		br.close();
		System.out.println("Shutting down executor service, Caught "+linkToCache.size()+" data pages"); 
		System.out.println("Finished main Phase");  
	}

	private String getBody(String link, WebDriver wdr) 
	{
		String body = "";
		String cachePage = linkToCache.get(link);
		if(!nullOrEmpty(cachePage)) {
			File dataFile = new File(cacheFilePath, cachePage);
			body = readFile(dataFile);
			System.err.println("Returning Cache body");
		}
		else {
			wdr.get(link);
			body = wdr.getPageSource();
		}

		return body;
	}
}
