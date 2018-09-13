package com.mstar.baa.spider;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.mstar.baa.utilities.BAASpiderUtility.*;

/**
 * 
 * 
 * @author Asus
 *
 */
public class BAASeleniumSpider extends BAABaseSpider{

	private String chromeDriverPath = null;  
	private WebDriver driver = null;
	private Drivers currentDriver = null;
	//private BlockingQueue<String> linksToVisit = null;
	private Queue<String> linksToVisit = null;
	private String mainPageBody = null;
	List<String> allLinks = null;

	public BAASeleniumSpider() {
		currentDriver = Drivers.HEADLESSCHROME;
	}

	public void setDriver(Drivers currentDriver)
	{
		this.currentDriver = currentDriver;
	}

	@Override
	public String getBody(String url) {
		driver.get(startLink);

		String body = driver.getPageSource();
		mainPageBody = body;
		return body;
	}

	@Override
	public void preparePhase()  {

		try {

			//linksToVisit = new ArrayBlockingQueue<String>(1000);
			linksToVisit = new PriorityQueue<>();
			linksToVisit.add(startLink); 
			allLinks = new CopyOnWriteArrayList<>();

			System.out.println("Inside Headless chrome");

			chromeDriverPath = "E:\\Chrome Driver\\chromedriver.exe" ;  
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);  
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

			driver = new ChromeDriver(options);

		}	catch(Exception  e) {

		}
	}

	@Override
	public void mainPhase(String url, String body) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postPhase(String url, String body) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isTraversalPage(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDataPage(String link) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> extractURLPhase(String url, String body) {

		List<String> links = new ArrayList<>();

		if(skipExtractLinkPhase)
			return links;

		if(!setExtractLinkFromDataPage && isDataPage(url))
			return links;

		driver.get(url); 
		System.out.println("Extracting link from : "+url); 

		List<WebElement> allElements = driver.findElements(By.tagName("a"));
		if(!nullOrZero(allElements)) {
			for(WebElement we : allElements) {
				String link = we.getAttribute("href");
				link = normalizeURL(link);

				if(nullOrZero(link))
					continue;
				if((isDataPage(link) || isTraversalPage(link)) && !linkToCache.containsKey(link)) {
					links.add(link);
					linkToCache.put(link, "");
					System.out.println("	"+link); 
				}
			}
		}
		return links;
	}

	private void extractAllUrls() {

		while(!linksToVisit.isEmpty()) {
			String link = linksToVisit.peek();
			List<String> links = extractURLPhase(link, null);

			if(!nullOrZero(links)) {
				links = links.stream().filter(element -> isTraversalPage(element)).collect(Collectors.toList()); 
				linksToVisit.addAll(links);
			}

			System.out.println("Removing "+link+" from queue "+linksToVisit.size()+" "); 
			linksToVisit.poll();
		}
	}

	@Override
	public void start(String startLink, int threadCount) {

		this.startLink = startLink;
		switch (currentDriver) {
		case HEADLESSCHROME: {

			//			driver.quit();
			preparePhase();
			String body = getBody(startLink);
			extractAllUrls();

			System.out.println("Finished Extract link phase"); 
			//ExecutorService ex = Executors.newFixedThreadPool(threadCount);

		}

		break;
		case CHROME: {

		}

		break;
		}

	}

}
