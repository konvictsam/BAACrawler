package com.baa.mstar.spider.interfaces;

import java.util.List;

public interface Crawlable {

	public String getBody(String url);
	public void preparePhase();
	public List<String> extractURLPhase(String url,String body);
	public void mainPhase(String url,String body);
	public void postPhase(String url, String body);
	public boolean isTraversalPage(String url);
	public boolean isDataPage(String url);
	public void start(String startLink,int threadCount); 
	public String normalizeURL(String url);
	public void setSkipExtractLinkPhase(boolean skipExtractLinkPhase);
	public void setExtractLinkFromDataPage(boolean setExtractLinkFromDataPage);
}
