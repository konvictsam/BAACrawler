package com.webcrawler.spider.interfaces;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.webcrawler.models.Product;
/**
 * 
 * @author Sameer Gaware
 *
 */
public interface Crawlable {

	public List<String> extractURLPhase(String url,String body);
	public String normalizeURL(String url);
	public String getSource(String url);
	public boolean isTraversalPage(String url);
	public boolean isDataPage(String url);
	public void mainPhase(String url,String body);
	public void postPhase(); 
	public void cleanUpPhase();
	public void start(String startLink,int threadCount); 
	public void setName(String name);
	public void preparePhase();
	public void setSkipExtractLinkPhase(boolean skipExtractLinkPhase);
	public void setExtractLinkFromDataPage(boolean setExtractLinkFromDataPage);
	public void addProducts(List<Product> products);
	public void addProduct(Product product);
} 
