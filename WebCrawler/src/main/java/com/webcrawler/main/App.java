package com.webcrawler.main;


import static com.webcrawler.utilities.SpiderUtility.*;

import java.util.ArrayList;
import java.util.List;

import com.webcrawler.models.Product;
import com.webcrawler.spiders.Drivers;
import com.webcrawler.spiders.SeleniumSpider;
import com.webcrawler.utilities.SpiderUtility;

/**
 * 
 * @author Sameer Gaware
 *
 */
public class App extends SeleniumSpider
{

	@Override
	public boolean isTraversalPage(String url) {
		return !nullOrEmpty(url) && url.startsWith("https://www.globalviews.com/categories/"); 
	}

	@Override
	public boolean isDataPage(String link) {
		return !nullOrEmpty(link) && link.startsWith("https://www.globalviews.com/product_groups/"); 
	}

	@Override
	public String normalizeURL(String url) {

		if(isTraversalPage(url)) {

			int index = url.indexOf("?");
			if(index >-1) {
				url = url.substring(0, index);
				url = url+"?all=true";
			}
			else
				return url+"?all=true";
		}

		else {

			List<String> arguments = new ArrayList<>();
			arguments.add("category_id");
			url = stripUrlArgsExcept(url, arguments);
		}

		return url;
	}

	@Override
	public void mainPhase(String url, String body) {
		String modelNumber = getModelNumber(body);
		String id = NAME+":"+modelNumber;
		String description = getDescription(body);
		String image = getImage(url,body);
		
		Product product = new Product();
		product.setModelNumber(modelNumber);
		product.setProductURL(url); 
		product.setDescription(description);
		product.setId(id);
		product.setImage(image);
		
		this.addProduct(product); 
	}

	private String getImage(String url, String body) { 
		String image = SpiderUtility.getStringWithinDelimiters(body, "<div id=\"main\">", "<div id=\"productdata\">");
		image = SpiderUtility.getPlainStringWithinDelimiters(image, "<a class=\"closeup_thumbnail\" href=\"", "\"><img class");
		
		return image;
	}

	private String getDescription(String body) {
		String desc = SpiderUtility.getPlainStringWithinDelimiters(body, "<span class=\"product_description\">", "</tbody>");
		return desc;
	}

	private String getModelNumber(String body) {
		String modelNumber = SpiderUtility.getStringWithinDelimiters(body, "<table id=\"detailstable\">", "</table>");
		modelNumber = SpiderUtility.getPlainStringWithinDelimiters(modelNumber, "<td>", "</td>");
		return modelNumber;
	}

	public static void main( String[] args )
	{
		try 
		{
			App a = new App();
			a.setName("GLOBAL_VIEW");
			a.setDriver(Drivers.HEADLESSCHROME,"C:\\Driver\\chromedriver.exe");  
			a.start("https://www.globalviews.com/categories", 10);
			a.setExtractLinkFromDataPage(false); 

		} catch(Exception ae) {

			ae.printStackTrace(); 
		}
	}

}
