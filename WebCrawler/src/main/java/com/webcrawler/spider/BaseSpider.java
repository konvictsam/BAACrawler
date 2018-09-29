package com.webcrawler.spider;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;

import com.webcrawler.spider.interfaces.Crawlable;

/**
 * 
 * @author Sameer Gaware
 *
 */
public abstract class BaseSpider implements Crawlable{

	public static String NAME = null;
	protected String body = null;
	protected boolean  isTraversalPage = false;
	protected boolean isDataPage = false;
	protected boolean skipExtractLinkPhase = false;
	protected boolean setExtractLinkFromDataPage = false;
	protected Set<String> visitedLinks = null;
	protected Map<String,String> linkToCache = null;
	protected String startLink = null;
	protected ExecutorService executorService = null;
	protected volatile int cacheCount = 0;
	protected File path = null;
	protected File cacheDirectory = null;
	protected Queue<String> linksToVisit = null;
	protected Queue<String> dataLinkQueue = null; 
	protected int threadCount = 1;

	@Override
	public List<String> extractURLPhase(String url, String body) {
		// TODO Auto-generated method stub
		return null;
	}

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
	public String normalizeURL(String url) {

		url = url.toLowerCase();
		return url;
	}
}
