package com.mstar.baa.spider;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.baa.mstar.spider.interfaces.Crawlable;


public abstract class BAABaseSpider implements Crawlable{

	protected String body = null;
	protected boolean  isTraversalPage = false;
	protected boolean isDataPage = false;
	protected boolean skipExtractLinkPhase = false;
	protected boolean setExtractLinkFromDataPage = false;
	protected Map<String,String> linkToCache = new ConcurrentHashMap<String, String>();
	protected String startLink = null;

	@Override
	public List<String> extractURLPhase(String url, String body) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setSkipExtractLinkPhase(boolean skipExtractLinkPhase) {
		this.skipExtractLinkPhase = skipExtractLinkPhase;

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
