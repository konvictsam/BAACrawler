package com.webcrawler.spiders;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;

import com.webcrawler.models.Product;
import com.webcrawler.spiders.interfaces.Crawlable;
import static com.webcrawler.utilities.SpiderUtility.*;

/**
 * 
 * @author Sameer Gaware
 *
 */
public abstract class Spider implements Crawlable{

	public static String NAME = null;
	protected String body = null;
	protected boolean  isTraversalPage = false;
	protected boolean isDataPage = false;
	protected boolean skipExtractLinkPhase = false;
	protected boolean setExtractLinkFromDataPage = false;
	protected Set<String> visitedLinks = null;
	protected Map<String,String> linkToCache = null;
	protected Queue<String> linksToVisit = null;
	protected Queue<String> dataLinkQueue = null; 
	protected String startLink = null;
	protected ExecutorService executorService = null;
	protected volatile int cacheCount = 0;
	protected File path = null;
	protected File cacheDirectory = null;
	protected int threadCount = 1;
	protected List<Product> products = null;


	@Override
	public void setSkipExtractLinkPhase(boolean skipExtractLinkPhase) {
		this.skipExtractLinkPhase = skipExtractLinkPhase;

	}

	public File getCacheDirectory() {
		path = new File("C:/web_crawler");
		if(!path.exists())
			path.mkdir();

		cacheDirectory = new File(path,NAME);
		if(!cacheDirectory.exists())
			cacheDirectory.mkdir();

		return cacheDirectory;
	}

	@Override
	public void setExtractLinkFromDataPage(boolean setExtractLinkFromDataPage) {
		this.setExtractLinkFromDataPage = setExtractLinkFromDataPage;

	}

	@Override
	public void addProducts(List<Product> products) {
		if(!nullOrEmpty(products))
			this.products.addAll(products); 

	}

	@Override
	public void addProduct(Product product) {
		if(product != null)
			this.products.add(product);

	}

	@Override
	public String normalizeURL(String url) {
		if(nullOrEmpty(url))
			return "";

		URI uri;

		try {
			uri = new URI(url);

			String scheme = uri.getScheme();
			if(!nullOrEmpty(scheme) && scheme.toLowerCase().equals("javascript"))
				return "";
			String authority = uri.getAuthority();
			String path = uri.getPath();
			String queryString = uri.getQuery();
			String fragment = null;

			return new URI(scheme,
					authority,
					path,
					queryString, 
					fragment).toString();// Ignore the fragment part of the input url
					
		} catch (URISyntaxException e) {
			System.err.println("Exception for normalizing "+url);
			e.printStackTrace();
			return "";
		}

	}
}
