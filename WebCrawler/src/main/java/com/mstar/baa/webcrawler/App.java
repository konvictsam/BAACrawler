package com.mstar.baa.webcrawler;


import com.mstar.baa.spider.BAASeleniumSpider;
import com.mstar.baa.spider.Drivers;
import static com.mstar.baa.utilities.BAASpiderUtility.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sameer Gaware
 *
 */
public class App extends BAASeleniumSpider
{

	@Override
	public boolean isTraversalPage(String url) {
		return !nullOrZero(url) && url.startsWith("https://www.globalviews.com/categories/"); 
	}

	@Override
	public boolean isDataPage(String link) {
		return !nullOrZero(link) && link.startsWith("https://www.globalviews.com/product_groups/"); 
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

	public static void main( String[] args )
	{
		try 
		{
			App a = new App();
			a.setDriver(Drivers.HEADLESSCHROME); 
			a.start("https://www.globalviews.com/categories", 10);
			a.setExtractLinkFromDataPage(false); 
		} catch(Exception ae) {

			ae.printStackTrace(); 
		}
	}

	@Override
	public void mainPhase(String url, String body) {
		// TODO Auto-generated method stub

	}
}
