package com.webcrawler.main;

import com.webcrawler.models.Product;
import com.webcrawler.spiders.Drivers;
import com.webcrawler.spiders.SeleniumSpider;
import static com.webcrawler.utilities.SpiderUtility.*;

import java.util.Arrays;

public class AmazonReview extends SeleniumSpider {

	@Override
	public boolean isTraversalPage(String url) {
		return !nullOrEmpty(url) && url.startsWith("https://www.amazon.in/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/"); 
	}

	@Override
	public boolean isDataPage(String url) {
		return !nullOrEmpty(url) && url.startsWith("https://www.amazon.in/gp/customer-reviews/") && url.contains("ASIN=B077PW9V3J"); 
	}

	@Override
	public String normalizeURL(String url) {
		
		if(isTraversalPage(url)) {
			url = stripUrlArgsExcept(url, Arrays.asList(new String[]{"pageNumber"}));  
		}
		
		else
			url = stripUrlArgsExcept(url, Arrays.asList(new String[]{"ASIN","ie"}));
		
		return url; 
	}
	
	@Override
	public void mainPhase(String url, String body) {
		String modelNumber = getModelNumber(url,body);
		String description = getDescription(url,body);
		String image = getImage(url,body);
		String id = getId(url,body);
		
		Product product = new Product();
		product.setModelNumber(modelNumber); 
		product.setProductURL(url);
		product.setId(id);
		product.setDescription(description);
		product.setImage(image); 
		
		this.addProduct(product); 
	}

	private String getId(String url, String body) {
		String id = getPlainStringWithinDelimiters(body, "class=\"a-size-base a-color-secondary review-date\">", "</span>");
		return id;
	}

	private String getImage(String url, String body) {
		String image = getStringWithinDelimiters(body, "<i data-hook=\"review-star-rating\"", "</span>");
		image = getStringAfter(image, "<span class=\"a-icon-alt\">");
		image = getPlainStringwithouthtml(image);
		return image;
	}

	private String getDescription(String url, String body) {
		String description = getStringWithinDelimiters(body, "class=\"a-size-base review-text\">", "</span>");
		description = getPlainStringwithouthtml(description);
		return description;
	}

	private String getModelNumber(String url, String body) {
		String modelNumber = getStringWithinDelimiters(body, "review-title a-color-base a-text-bold\"", "</div>");
		modelNumber = getStringAfter(modelNumber, "\">");
		modelNumber = getPlainStringwithouthtml(modelNumber);
		return modelNumber;
	}

	public static void main(String args[]) {
		AmazonReview amazonReview = new AmazonReview();
		amazonReview.setName("AMAZON");
		amazonReview.setDriver(Drivers.HEADLESSCHROME, "C:\\\\Driver\\\\chromedriver.exe"); 
		amazonReview.start("https://www.amazon.in/Redmi-6A-Black-2GBRAM-Storage/product-reviews/B077PW9V3J/", 10);
		amazonReview.setSkipExtractLinkPhase(false); 
	}
}
