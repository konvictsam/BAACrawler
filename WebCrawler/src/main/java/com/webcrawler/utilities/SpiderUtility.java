package com.webcrawler.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
/**
 * 
 * @author Sameer Gaware
 *
 */
public  class SpiderUtility
{
	/**
	 * 
	 * @param input
	 * @return
	 */
	public static boolean nullOrEmpty(String input) {
		
		return (input == null || input.length() == 0);
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public static<T> boolean nullOrEmpty(List<T> list) {
		
		return (list == null || list.size() == 0);
	}

	/**
	 * 
	 * @param url
	 * @param arguments
	 * @return
	 */
	public static String stripUrlArgsExcept(String url,List<String> arguments) {
		
		if(nullOrEmpty(url))
			return "";

		int index = url.indexOf("?");
		String queryString = "";

		if(index > -1) {
			String argsSection = url.substring(index+1);
			if(!nullOrEmpty(argsSection)) {
				List<String> args = Arrays.asList(argsSection.split("&")); 
				if(!nullOrEmpty(args)) {
					for(String argument : arguments) {
						for(String arg : args) {
							if(arg.startsWith(argument+"=")) {
								if(queryString.equals("")) {
									queryString = queryString+arg;
								}
								else
									queryString = queryString+"&"+arg;
							}
						}
					}

					if(!nullOrEmpty(queryString))
						url = url.substring(0, index) +"?"+queryString;
					else
						url = url.substring(0, index);
				}
			}
		}
		return url;
	}

	/**
	 * 
	 * @param path
	 * @param encoding
	 * @return
	 * @throws IOException
	 */
	public static String getFileContent(File cacheFile) {
		
		try {
			byte[] encoded = Files.readAllBytes(cacheFile.toPath()); 
			return new String(encoded);
		}catch(IOException qe) {
			qe.printStackTrace();
			return "";
		}
	}

	/**
	 * This method returns the substring between the startString and endString of the given pageSource
	 * 
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return 
	 */
	public static String getStringWithinDelimiters(String pageSource,String startString,String endString) {
		
		if(nullOrEmpty(pageSource))
			return "";
		
		if(nullOrEmpty(startString) || nullOrEmpty(endString))
			return pageSource;

		String outString = StringUtils.substringBetween(pageSource, startString, endString);
		return outString;
	}

	/**
	 * This method returns the plain string without html tags of the given pageSource containing html
	 * Before making changes to this method please talk to Kiran Gavhane 
	 * @param inputString
	 * @return
	 */
	public static String getPlainStringwithouthtml(String inputString) {
		
		if(nullOrEmpty(inputString))
			return "";
				
		String noHtml = inputString.toString().replaceAll("<[^>]*>", "").replaceAll("\t","").replaceAll("\r","");
		
		String outputString = noHtml.trim();
		return outputString;
	}

	/**
	 * This method returns the substring without html tag between the startString and endString of the given pageSource
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return
	 */
	public static String getPlainStringWithinDelimiters(String pageSource,String startString, String endString) {
		
		if(nullOrEmpty(pageSource))
			return "";
		
		if(nullOrEmpty(startString) || nullOrEmpty(endString))
			return pageSource;
		
		String outputString = getStringWithinDelimiters(pageSource, startString, endString);
		outputString = getPlainStringwithouthtml(outputString);
		return outputString;
	}

	/**
	 * This method returns the List of substring  between the startString and endString of the given pageSource
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return
	 */
	public static List<String> getListwithinDelimiter(String pageSource,String startString, String endString) {

		if(nullOrEmpty(pageSource))
			return Arrays.asList(""); 
		
		if(nullOrEmpty(startString) || nullOrEmpty(endString))
			return Arrays.asList(""); 

		List<String> outputList = Arrays.asList(StringUtils.substringsBetween(pageSource, startString, endString));
		return outputList;
	}

	/**
	 * This method returns the list of substring without html tag between the startString and endString of the given pageSource
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return
	 */
	public static List<String> getPlainListWithinDelimiters(String pageSource,String startString, String endString) {
		
		if(nullOrEmpty(pageSource))
			return Arrays.asList(""); 
		
		if(nullOrEmpty(startString) || nullOrEmpty(endString))
			return Arrays.asList(""); 
		
		List<String> outputList = getListwithinDelimiter(pageSource, startString, endString);
		outputList = outputList.stream().map(element -> getPlainStringwithouthtml(element)).collect(Collectors.toList());
		return outputList;		
	}

	/**
	 * 
	 * @param pageSource
	 * @param substring
	 * @return
	 */
	public static String getStringAfter(String pageSource, String substring) {
		
		if(nullOrEmpty(pageSource))
			return "";
		if(nullOrEmpty(substring))
			return pageSource;

		int substringIndex = pageSource.indexOf(substring);
		if(substringIndex == -1)
			return "";

		int pageSourceLength = pageSource.length();
		int substringLength = substring.length();
		int adjustedIndex = substringIndex + substringLength;

		if(adjustedIndex >= pageSourceLength)
			return "";

		String outputString = pageSource.substring(adjustedIndex);
		return outputString;
	}
}