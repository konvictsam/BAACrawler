package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.webcrawler.models.Product;
import com.webcrawler.models.Products;
import com.webcrawler.utilities.SpiderUtility;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String argsp[]) throws JAXBException
	{
		/*System.out.println("Inside Headless chrome");

		String chromeDriverPath = "E:\\Chrome Driver\\chromedriver.exe" ;  
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);  
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");

		WebDriver driver = new ChromeDriver(options);

		while(true) {
			Thread t = new Thread(() -> {driver.get("https://www.globalviews.com/"); driver.findElements(By.tagName("a"));});
			t.start();
		}*/

		/*List<String> list = Arrays.asList("asfdkjsdf","asdasdasd","sadasdsa","Sam");
		List<String> fiiltered = list.stream().filter(element -> element.startsWith("Sam")).collect(Collectors.toList()); 
		System.out.println(fiiltered); */
		
		/*Products products = new Products();
		products.setProducts(new ArrayList<Product>()); 
		
		
		Product product = new Product();
		product.setDescription("Moto G5S Plus");
		product.setId("GOLBAL_VIEWS:123");
		product.setModelNumber("G5SPlus"); 
		
		Product product2 = new Product();
		product2.setDescription("Moto G5S Plus_2");
		product2.setId("GOLBAL_VIEWS:123_2");
		product2.setModelNumber("G5SPlus_2"); 
		
		
		products.getProducts().add(product);
		products.getProducts().add(product2);
		
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	     
	    //Marshal the employees list in console
	    jaxbMarshaller.marshal(products, System.out);
	     
	    //Marshal the employees list in file
	    jaxbMarshaller.marshal(products, new File("C:\\Users\\Asus\\Desktop\\products.xml"));*/
		 
		String source = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n" + 
				"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\r\n" + 
				"  <meta id=\"viewport\" name=\"viewport\" />\r\n" + 
				"\r\n" + 
				"<script type=\"text/javascript\" async=\"\" src=\"https://www.google-analytics.com/analytics.js\"></script><script type=\"text/javascript\">\r\n" + 
				"  //mobile viewport hack\r\n" + 
				"  (function(){\r\n" + 
				"\r\n" + 
				"    function apply_viewport(){\r\n" + 
				"      if( /Android|webOS|iPhone|iPad|iPod|BlackBerry/i.test(navigator.userAgent)   ) {\r\n" + 
				"\r\n" + 
				"        var ww = window.screen.width;\r\n" + 
				"        var mw = 980; // min width of site\r\n" + 
				"        var ratio =  ww / mw; //calculate ratio\r\n" + 
				"        var viewport_meta_tag = document.getElementById('viewport');\r\n" + 
				"        if( ww &lt; mw){ //smaller than minimum size\r\n" + 
				"          viewport_meta_tag.setAttribute('content', 'initial-scale=' + ratio + ', maximum-scale=' + ratio + ', minimum-scale=' + ratio + ', user-scalable=no, width=' + mw);\r\n" + 
				"        }\r\n" + 
				"        else { //regular size\r\n" + 
				"          viewport_meta_tag.setAttribute('content', 'initial-scale=1.0, maximum-scale=1, minimum-scale=1.0, user-scalable=yes, width=' + ww);\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"    //ok, i need to update viewport scale if screen dimentions changed\r\n" + 
				"    window.addEventListener('resize', function(){\r\n" + 
				"      apply_viewport();\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    apply_viewport();\r\n" + 
				"\r\n" + 
				"  }());\r\n" + 
				"</script>\r\n" + 
				"  <title>GLOBAL VIEWS | products | Saturn Bowl-Gold</title>\r\n" + 
				"  <meta name=\"description\" content=\"GLOBAL VIEWS | Art Glass | 6.60422 - Saturn Bowl-Gold\" />\r\n" + 
				"        <meta name=\"google-site-verification\" content=\"2Vw_13XiS7BnisecYF8K1dxijdq8ORr1-mIkP4AwytM\" />\r\n" + 
				"\r\n" + 
				"  <link rel=\"stylesheet\" media=\"screen\" href=\"/assets/application-367f903b1264054de22b9dc3f24e7d9173d1b8380c93f3c5cf6e3fa39577b6d6.css\" />\r\n" + 
				"  <script src=\"/assets/application-62bb03792806d1c33e60c659b512e8201860a418e17081b300b6d31779606aa0.js\"></script>\r\n" + 
				"  <meta name=\"csrf-param\" content=\"authenticity_token\" />\r\n" + 
				"<meta name=\"csrf-token\" content=\"U7sm8VDaa4eDBhVHEzeSLVQ8+EtPTvxs4PDKi4qSdGBB+3sTHVzlYAy+2xV163JlqtkjvL3an/z8hWQWHk0GhA==\" />\r\n" + 
				"\r\n" + 
				"  <style>\r\n" + 
				"\r\n" + 
				"      img {\r\n" + 
				"          border: none;\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"      #search {\r\n" + 
				"          float: right;\r\n" + 
				"          margin-top: 1em;\r\n" + 
				"          text-align: right;\r\n" + 
				"      }\r\n" + 
				"\r\n" + 
				"  </style>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<div id=\"top-banner-bg\">\r\n" + 
				"  <br />\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id=\"main-div\">\r\n" + 
				"\r\n" + 
				"  <script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"    $(function () {\r\n" + 
				"        $('#sku').bind('click', function (event) {\r\n" + 
				"            event.target.value = \"\"\r\n" + 
				"        });\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    });\r\n" + 
				"</script>\r\n" + 
				"<!-- Global site tag (gtag.js) - Google Analytics -->\r\n" + 
				"<script async=\"\" src=\"https://www.googletagmanager.com/gtag/js?id=UA-8975387-1\"></script>\r\n" + 
				"<script>\r\n" + 
				"  window.dataLayer = window.dataLayer || [];\r\n" + 
				"  function gtag(){dataLayer.push(arguments);}\r\n" + 
				"  gtag('js', new Date());\r\n" + 
				"\r\n" + 
				"  gtag('config', 'UA-8975387-1');\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"<div id=\"top-banner\">\r\n" + 
				"\r\n" + 
				"      <div id=\"top-banner-inner-div\">\r\n" + 
				"  <span style=\"position: relative; top: -1px; display: inline-block; background-color: #FFF; padding: 0 10px 0 10px; height: 40px;\">\r\n" + 
				"    <a href=\"/welcome/index\"><img style=\"position: relative; top: 8px; height: 25px;\" src=\"/assets/GV-top-nav-button1-2317ce166733f58ee48df5114d55fbb3bf35df1b0b2bae1884889be5c288f513.jpg\" alt=\"Gv top nav button1 2317ce166733f58ee48df5114d55fbb3bf35df1b0b2bae1884889be5c288f513\" /></a>\r\n" + 
				"  </span><span style=\"margin: 0 100px 0 0; position: relative; top: -1px; display: inline-block; background-color: #999; padding: 0 10px 0 10px; height: 40px;\">\r\n" + 
				"    <a href=\"https://www.studioa-home.com\"><img style=\"height: 25px; position: relative; top: 8px;\" src=\"/assets/SA-top-nav-button2-c1cc322a2a23a0d5e6a8991f8025f0e9b307d9454849cf853b4b24eeca342572.jpg\" alt=\"Sa top nav button2 c1cc322a2a23a0d5e6a8991f8025f0e9b307d9454849cf853b4b24eeca342572\" /></a>\r\n" + 
				"  </span>\r\n" + 
				"\r\n" + 
				"  <a class=\"banner-link login-link\" id=\"login-link\" href=\"/login\">login</a>\r\n" + 
				"\r\n" + 
				"  <span class=\"banner-separator\">|</span>\r\n" + 
				"\r\n" + 
				"  <a class=\"banner-link\" href=\"/accounts/new\">Create Web Account</a>\r\n" + 
				"\r\n" + 
				"  <span class=\"banner-separator\">|</span>\r\n" + 
				"\r\n" + 
				"  <form action=\"/product_groups/search\" accept-charset=\"UTF-8\" method=\"get\"><input name=\"utf8\" type=\"hidden\" value=\"â\" />\r\n" + 
				"      <input type=\"text\" name=\"sku\" id=\"search-field\" value=\"SEARCH\" size=\"20\" class=\"top-banner-fields\" />\r\n" + 
				"      <input alt=\"Go arrow\" type=\"image\" src=\"/assets/go-arrow-e164fb2644ddd1215fe4484feffcd1355ce8041bdc1c42d0a41a029b712ea1e9.jpg\" id=\"search-button\" height=\"18\" style=\"margin:0 -4px; border: none;\" />\r\n" + 
				"</form>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id=\"masthead\">\r\n" + 
				"\r\n" + 
				"  <div style=\"position: relative; left: 250px; top: 15px;\">\r\n" + 
				"  <a href=\"/welcome/index\"><img width=\"300\" class=\"logo\" src=\"/assets/gvlogo450-38e7ebc431cd93d073ad7d584eaa88d7e92ad13d9ea2706530d741886c5adbc6.png\" alt=\"Gvlogo450 38e7ebc431cd93d073ad7d584eaa88d7e92ad13d9ea2706530d741886c5adbc6\" /></a>\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id=\"straplinewrapper\">\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id=\"navbar\">\r\n" + 
				"\r\n" + 
				"  <a href=\"/categories\">PRODUCTS</a>\r\n" + 
				"\r\n" + 
				"  <a href=\"/showrooms/highpoint\">SHOWROOMS</a>\r\n" + 
				"\r\n" + 
				"  <a href=\"/salesteam/unitedstates\">SALES TEAM</a>\r\n" + 
				"\r\n" + 
				"  <a href=\"/retailers\">LOCATE A RETAILER</a>\r\n" + 
				"\r\n" + 
				"  <a href=\"/prnews/index\">BLOG</a>\r\n" + 
				"\r\n" + 
				"  <a href=\"/hospitality/about\">HOSPITALITY</a>\r\n" + 
				"\r\n" + 
				"  \r\n" + 
				"\r\n" + 
				"  <a id=\"last\" href=\"/catalogs/index\">CATALOGS</a>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<!-- session warning dialog -->\r\n" + 
				"<div style=\"display:none\">\r\n" + 
				"  <div class=\"modal\" id=\"session-timeout-dialog\">\r\n" + 
				"    <h2>SESSION TIMEOUT</h2>\r\n" + 
				"\r\n" + 
				"    <p>\r\n" + 
				"      Your session will timeout in two minutes due to inactivity. Click the OK button if you wish to continue\r\n" + 
				"      your session.\r\n" + 
				"    </p>\r\n" + 
				"    <form html=\"{:data_type=&gt;&quot;script&quot;, :id=&gt;&quot;session-warning-form&quot;}\" action=\"/touch_session\" accept-charset=\"UTF-8\" data-remote=\"true\" method=\"post\"><input name=\"utf8\" type=\"hidden\" value=\"â\" />\r\n" + 
				"\r\n" + 
				"        <div class=\"actions\">\r\n" + 
				"          <button type=\"submit\" class=\"button close\">OK</button>\r\n" + 
				"        </div>\r\n" + 
				"</form>  </div>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  <div id=\"wrapper\">\r\n" + 
				"\r\n" + 
				"    <div id=\"sidebar\">\r\n" + 
				"      <script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"    $(function() {\r\n" + 
				"        $('.subNNNcategories').css(\"display\", \"none\");\r\n" + 
				"\r\n" + 
				"        $('#subNNNcategories198').css(\"display\", \"block\");\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        $('#panelNNN199').bind('click', '#subNNNcategories199', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN200').bind('click', '#subNNNcategories200', togglePanel);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        $('#panelNNN203').bind('click', '#subNNNcategories203', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN204').bind('click', '#subNNNcategories204', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN205').bind('click', '#subNNNcategories205', togglePanel);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        $('#panelNNN209').bind('click', '#subNNNcategories209', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN210').bind('click', '#subNNNcategories210', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN211').bind('click', '#subNNNcategories211', togglePanel);\r\n" + 
				"\r\n" + 
				"        $('#panelNNN212').bind('click', '#subNNNcategories212', togglePanel);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        $('#panelNNN214').bind('click', '#subNNNcategories214', togglePanel);\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    var openPanel = null;\r\n" + 
				"\r\n" + 
				"    function togglePanel(event) {\r\n" + 
				"        if (openPanel != null) {\r\n" + 
				"            $(openPanel).css(\"display\", \"none\");\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        if ($(event.data).css(\"display\") == \"none\") {\r\n" + 
				"            $(event.data).css(\"display\", \"block\");\r\n" + 
				"            openPanel = event.data;\r\n" + 
				"        }\r\n" + 
				"        else {\r\n" + 
				"            $(event.data).css(\"display\", \"none\");\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"\r\n" + 
				"<div id=\"special_projects\" class=\"sidepanel_linkgroup\">\r\n" + 
				"  <ul>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/ann_gish\">Ann Gish</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/arete_collection\">Arete Collection</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/barbara_barry\">Barbara Barry</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/dwellstudio\">DwellStudio</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/julia_buckingham\">Julia Buckingham</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/mcfchan\">MCFCHAN Collections</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/williamsburg\">WILLIAMSBURG</a></li>\r\n" + 
				"  </ul>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"<div id=\"categories\" class=\"sidepanel_linkgroup\">\r\n" + 
				"  <ul>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel198\" href=\"/categories/198\">Art Glass</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel199\" href=\"/categories/199\">Barware</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories199\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/215\">Decanters</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/216\">Drinkware</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/217\">Serveware</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel200\" href=\"/categories/200\">Candleholders</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories200\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/219\">Brass &amp; Bronze</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/220\">Ceramic</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/221\">Crystal</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/222\">Glass</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/223\">Hurricanes/Lanterns</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/224\">Iron</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/225\">Nickel</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/226\">Porcelain</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/228\">Wood</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel201\" href=\"/categories/201\">Candles Snuffers</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel202\" href=\"/categories/202\">Clear Glass</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel203\" href=\"/categories/203\">Decorative Items</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories203\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/229\">Accent Pieces</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/230\">Animals</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/232\">Bottles &amp; Jars</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/233\">Chargers &amp; Plates</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/234\">Compotes &amp; Bowls</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/236\">Plate Stands</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/237\">Vases &amp; Urns</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel204\" href=\"/categories/204\">Electrified Lighting</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories204\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/238\">Accent Lamps</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/239\">Buffet Lamps</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/242\">Chandeliers</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/240\">Floor Lamps</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/241\">Pendants</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/243\">Sconces</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/244\">Table Lamps</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel205\" href=\"/categories/205\">Furniture</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories205\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/261\">Bar</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/245\">Bedroom</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/246\">Bookcases &amp; Shelves</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/247\">Cabinets &amp; Chests</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/248\">Media Cabinets</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/249\">Pedestals</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel206\" href=\"/categories/206\">Mirrors</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel207\" href=\"/categories/207\">Office</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel208\" href=\"/categories/208\">Sculpture</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel209\" href=\"/categories/209\">Seating</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories209\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/250\">Benches</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/251\">Dining Chairs</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/254\">Occasional Chairs</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/252\">Ottomans</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/255\">Sofas</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/253\">Stools</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel210\" href=\"/categories/210\">Storage</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories210\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/256\">Jewelry Boxes</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/258\">Magazine Caddies</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/260\">Storage Boxes</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/259\">Umbrella Stands</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel211\" href=\"/categories/211\">Tables</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories211\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/262\">Cocktail</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/263\">Console</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/264\">Desk</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/265\">Dining</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/266\">End Table</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/267\">Occasional</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel212\" href=\"/categories/212\">Textiles</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories212\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/269\">Pillows</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/270\">Rugs</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel213\" href=\"/categories/213\">Trays</a>\r\n" + 
				"\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <li class=\"productcategoryname\">\r\n" + 
				"          <a id=\"panel214\" href=\"/categories/214\">Wall Decor</a>\r\n" + 
				"\r\n" + 
				"                  <ul id=\"subcategories214\" class=\"subcategories\" style=\"display: none;\">\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/272\">Wall Objects</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/273\">Wall Panels</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/274\">Wall Sconces</a>\r\n" + 
				"                      </li>\r\n" + 
				"                      <li class=\"productcategoryname\">\r\n" + 
				"                        <a href=\"/categories/275\">Wall Shelves</a>\r\n" + 
				"                      </li>\r\n" + 
				"              </ul>\r\n" + 
				"        </li>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  </ul>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id=\"special_categories\" class=\"sidepanel_linkgroup\">\r\n" + 
				"  <ul>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/categories/100\">Online Only</a></li>\r\n" + 
				"    <li class=\"productcategoryname\"><a href=\"/categories/101\">Decor Gifts</a></li>\r\n" + 
				"\r\n" + 
				"    <!--li class=\"productcategoryname\"><a href=\"/giftguide\">Gift Guide</a></li-->\r\n" + 
				"  </ul>\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"    $(function () {\r\n" + 
				"        $('#detailimagelink').bind('click', function (event) {\r\n" + 
				"            window.open('/product_groups/24159/closeup', \"closeupwindow\",\r\n" + 
				"                \"height=625,width=700,toolbar=no,menubar=no,resizable=no,location=no,directories=no,status=no\");\r\n" + 
				"            return false;\r\n" + 
				"        });\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"<script type=\"text/javascript\">\r\n" + 
				"\r\n" + 
				"    $(function () {\r\n" + 
				"        $('.closeup_thumbnail').click(function (event) {\r\n" + 
				"            showPic(this);\r\n" + 
				"            return false;\r\n" + 
				"        });\r\n" + 
				"    });\r\n" + 
				"\r\n" + 
				"    function showPic(whichpic) {\r\n" + 
				"        $(\"#detailimage\").attr(\"src\", $(whichpic).attr(\"href\"));\r\n" + 
				"    }\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</script>\r\n" + 
				"<style>\r\n" + 
				"  #detailimage {\r\n" + 
				"    width: 500px;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  .thumblist {\r\n" + 
				"    height: 500px;\r\n" + 
				"    float: right;\r\n" + 
				"    list-style: none;\r\n" + 
				"    margin: 0 0 0 8px;\r\n" + 
				"    padding: 0;\r\n" + 
				"    width: 240px;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  .thumblist li {\r\n" + 
				"    margin: 0 8px 8px 0;\r\n" + 
				"    width: 110px;\r\n" + 
				"    display: inline-block;\r\n" + 
				"  }\r\n" + 
				"\r\n" + 
				"  .thumblist li img {\r\n" + 
				"    width: 110px;\r\n" + 
				"  }\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"<div id=\"main\">\r\n" + 
				"  <ul class=\"thumblist\">\r\n" + 
				"      <li>\r\n" + 
				"        <a class=\"closeup_thumbnail\" href=\"https://gvimages.azureedge.net/images/6.60422.jpg\"><img class=\"thumbnail\" src=\"https://gvimages.azureedge.net/thumbnails/6.60422.jpg\" alt=\"6.60422\" /></a>\r\n" + 
				"      </li>\r\n" + 
				"  </ul>\r\n" + 
				"\r\n" + 
				"    <img id=\"detailimage\" src=\"https://gvimages.azureedge.net/images/6.60422.jpg\" alt=\"6.60422\" />\r\n" + 
				"\r\n" + 
				"  <div id=\"productdata\">\r\n" + 
				"      <a href=\"/categories/198\">BACK to thumbnails</a>\r\n" + 
				"\r\n" + 
				"    <table id=\"detailstable\">\r\n" + 
				"\r\n" + 
				"      <tbody><tr>\r\n" + 
				"        <th>ITEM#</th>\r\n" + 
				"        <th>DESCRIPTION</th>\r\n" + 
				"        <th>DIMENSIONS</th>\r\n" + 
				"        <th style=\"text-align: center; padding-right: 8px;\">TEARSHEET\r\n" + 
				"        </th>\r\n" + 
				"      </tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            <form action=\"/line_items\" accept-charset=\"UTF-8\" method=\"post\"></form><input name=\"utf8\" type=\"hidden\" value=\"â\" /><input type=\"hidden\" name=\"authenticity_token\" value=\"dS5y2leOv9BX9QunALKJd9/SdSRBYWCzJIFxfDXM8ENnbi84GggxN9hNxfVmbmk/ITeu07P1AyM49N/hoROCpw==\" />\r\n" + 
				"              <tr>\r\n" + 
				"  <td>6.60422</td>\r\n" + 
				"  <td>Saturn Bowl-Gold</td>\r\n" + 
				"  <td>\r\n" + 
				"    <ul>\r\n" + 
				"          <li>\r\n" + 
				"            21.5\"Dia. x 8\"H\r\n" + 
				"          </li>\r\n" + 
				"    </ul>\r\n" + 
				"  </td>\r\n" + 
				"  <td class=\"ts_logo\">\r\n" + 
				"    <a target=\"_blank\" href=\"/products/23633.pdf\"><img width=\"20\" height=\"26\" title=\"Unpriced tearsheet\" src=\"/assets/icons/ts_1up_unpriced-fc87b058bf42d22b50e2967a67014236903a986009eac2fdbcad14fda2518e09.png\" alt=\"Ts 1up unpriced fc87b058bf42d22b50e2967a67014236903a986009eac2fdbcad14fda2518e09\" /></a>\r\n" + 
				"  </td>\r\n" + 
				"  <td>\r\n" + 
				"</td></tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <tr>\r\n" + 
				"          <td colspan=\"4\">\r\n" + 
				"            <br /><br />\r\n" + 
				"            <span class=\"product_description\">\r\n" + 
				"               Saturn bowl is hand crafted stepped art glass with rings of gold metallic glaze.\r\n" + 
				"            </span>\r\n" + 
				"          </td>\r\n" + 
				"        </tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    </tbody></table>\r\n" + 
				"\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <div id=\"footer\">\r\n" + 
				"\r\n" + 
				"  <div id=\"footerlinks\">\r\n" + 
				"    <p>\r\n" + 
				"      <a href=\"/contactus/new\">contact us</a>\r\n" + 
				"      | <a href=\"/marketdates/index\">market dates</a>\r\n" + 
				"      | <a href=\"/terms/index\">terms agreement</a>\r\n" + 
				"      | <a href=\"/privacypolicy/index\">privacy policy</a>\r\n" + 
				"      | <a href=\"/environmentalstatement/index\">environmental statement</a>\r\n" + 
				"      | <a target=\"_blank\" href=\"/GV-CreditApplication.pdf\">credit application</a>\r\n" + 
				"      | <a href=\"/retailtips/index\">recipes</a>\r\n" + 
				"      | <a href=\"/welcome/garagesale\">garage sale</a>\r\n" + 
				"    </p>\r\n" + 
				"\r\n" + 
				"    <div id=\"social_networks\">\r\n" + 
				"\r\n" + 
				"      <span class=\"social_link\">\r\n" + 
				"        <a target=\"blank\" href=\"http://www.facebook.com/globalviews\">Facebook</a>\r\n" + 
				"        <img width=\"16\" height=\"16\" src=\"/assets/icons/icon_facebook-f2236549c6854371b4ff6b649d2b0a56af95f42bfd6f14d1e8ca96374154dce8.gif\" alt=\"Icon facebook f2236549c6854371b4ff6b649d2b0a56af95f42bfd6f14d1e8ca96374154dce8\" />\r\n" + 
				"      </span>\r\n" + 
				"\r\n" + 
				"      <span class=\"social_link\">\r\n" + 
				"        <a target=\"blank\" href=\"http://www.twitter.com/globalviews\">Twitter</a>\r\n" + 
				"        <img width=\"16\" height=\"16\" src=\"/assets/icons/icon_twitter-7e6d9ab3f51354ffafc6f1c80ab307a294ae38610f38bf226f429cdae19a6938.gif\" alt=\"Icon twitter 7e6d9ab3f51354ffafc6f1c80ab307a294ae38610f38bf226f429cdae19a6938\" />\r\n" + 
				"      </span>\r\n" + 
				"\r\n" + 
				"      <span class=\"social_link\">\r\n" + 
				"        <a target=\"blank\" href=\"http://www.pinterest.com/globalviews\">Pinterest</a>\r\n" + 
				"        <img width=\"16\" height=\"16\" src=\"/assets/icons/icon_pinterest-1a195c6ebd094944c09e7794dda4d7c1ebe9f851912ad36f3cd5dfbede39ffd3.png\" alt=\"Icon pinterest 1a195c6ebd094944c09e7794dda4d7c1ebe9f851912ad36f3cd5dfbede39ffd3\" />\r\n" + 
				"      </span>\r\n" + 
				"\r\n" + 
				"      <span class=\"social_link last\">\r\n" + 
				"        <a target=\"blank\" href=\"http://www.instagram.com/globalviews\">Instagram</a>\r\n" + 
				"        <img width=\"16\" height=\"16\" src=\"/assets/icons/icon_instagram-99e22df495ee8d568eb2886ce4c16861734f437ff777077503c810f82cd01deb.png\" alt=\"Icon instagram 99e22df495ee8d568eb2886ce4c16861734f437ff777077503c810f82cd01deb\" />\r\n" + 
				"      </span>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"    <p>\r\n" + 
				"      <a target=\"blank\" href=\"https://www.secure-server.com/art/forms/join_form.html\">ART - your industry resource - join today</a>\r\n" + 
				"     | <a target=\"blank\" href=\"http://www.williamsburgmarketplace.com/webapp/wcs/stores/servlet/HomeView?storeId=10001&amp;catalogId=10602\">williamsburg marketplace</a>\r\n" + 
				"    </p>\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"  <div id=\"copyright_msg\">\r\n" + 
				"    Â©2018 Global Views. All rights reserved.\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  </div>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<div id=\"fancybox-tmp\"></div><div id=\"fancybox-loading\"><div></div></div><div id=\"fancybox-overlay\"></div><div id=\"fancybox-wrap\"><div id=\"fancybox-outer\"><div class=\"fancybox-bg\" id=\"fancybox-bg-n\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-ne\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-e\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-se\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-s\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-sw\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-w\"></div><div class=\"fancybox-bg\" id=\"fancybox-bg-nw\"></div><div id=\"fancybox-content\"></div><a id=\"fancybox-close\"></a><div id=\"fancybox-title\"></div><a href=\"javascript:;\" id=\"fancybox-left\"><span class=\"fancy-ico\" id=\"fancybox-left-ico\"></span></a><a href=\"javascript:;\" id=\"fancybox-right\"><span class=\"fancy-ico\" id=\"fancybox-right-ico\"></span></a></div></div></body></html>";
		
		String tempsource = "<tbody><tr>\r\n" + 
				"        <th>ITEM#</th>\r\n" + 
				"        <th>DESCRIPTION</th>\r\n" + 
				"        <th>DIMENSIONS</th>\r\n" + 
				"        <th style=\"text-align: center; padding-right: 8px;\">TEARSHEET\r\n" + 
				"        </th>\r\n" + 
				"      </tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            <form action=\"/line_items\" accept-charset=\"UTF-8\" method=\"post\"></form><input name=\"utf8\" type=\"hidden\" value=\"â\" /><input type=\"hidden\" name=\"authenticity_token\" value=\"dS5y2leOv9BX9QunALKJd9/SdSRBYWCzJIFxfDXM8ENnbi84GggxN9hNxfVmbmk/ITeu07P1AyM49N/hoROCpw==\" />\r\n" + 
				"              <tr>\r\n" + 
				"  <td>6.60422</td>\r\n" + 
				"  <td>Saturn Bowl-Gold</td>\r\n" + 
				"  <td>\r\n" + 
				"    <ul>\r\n" + 
				"          <li>\r\n" + 
				"            21.5\"Dia. x 8\"H\r\n" + 
				"          </li>\r\n" + 
				"    </ul>\r\n" + 
				"  </td>\r\n" + 
				"  <td class=\"ts_logo\">\r\n" + 
				"    <a target=\"_blank\" href=\"/products/23633.pdf\"><img width=\"20\" height=\"26\" title=\"Unpriced tearsheet\" src=\"/assets/icons/ts_1up_unpriced-fc87b058bf42d22b50e2967a67014236903a986009eac2fdbcad14fda2518e09.png\" alt=\"Ts 1up unpriced fc87b058bf42d22b50e2967a67014236903a986009eac2fdbcad14fda2518e09\" /></a>\r\n" + 
				"  </td>\r\n" + 
				"  <td>\r\n" + 
				"</td></tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <tr>\r\n" + 
				"          <td colspan=\"4\">\r\n" + 
				"            <br /><br />\r\n" + 
				"            <span class=\"product_description\">\r\n" + 
				"               Saturn bowl is hand crafted stepped art glass with rings of gold metallic glaze.\r\n" + 
				"            </span>\r\n" + 
				"          </td>\r\n" + 
				"        </tr>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    </tbody>\r\n" + 
				"";
		
		
		String modelNumber = SpiderUtility.getStringWithinDelimiters(source, "<table id=\"detailstable\">", "</table>");
		modelNumber = SpiderUtility.getPlainStringWithinDelimiters(modelNumber, "<td>", "</td>");
		String id = "";
		String image = SpiderUtility.getStringWithinDelimiters(source, "<div id=\"main\">", "<div id=\"productdata\">");
		image = SpiderUtility.getPlainStringWithinDelimiters(image, "<a class=\"closeup_thumbnail\" href=\"", "\"><img class");
		
		String desc = SpiderUtility.getPlainStringWithinDelimiters(source, "<span class=\"product_description\">", "</tbody>");
		System.out.println("desc : "+desc);
		System.out.println("Model : "+modelNumber);
		System.out.println("Id : "+id);
		System.out.println("image : "+image);
		 
		
		
	}

}
