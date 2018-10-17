package com.webcrawler.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
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
	public static String stripUrlArgsExcept(String url,List<String> arguments)
	{
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
	public static String readFile(File cacheFile)   
	{
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
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return 
	 */
	public static String getStringWithinDelimiters(String pageSource,String startString,String endString)
	{
		if(pageSource == null  || pageSource.length() == 0)
			return "";

		if(startString == null || startString.length() == 0 || endString == null || endString.length() == 0)
			return "";

		int lengthofstartstring = startString.length();
		int startStringIndex = pageSource.indexOf(startString);
		int endStringIndex = pageSource.indexOf(endString);

		//System.out.println(s);
		if(endStringIndex < 0) {
			return "";
		}
		String s = pageSource.substring(startStringIndex+lengthofstartstring,endStringIndex);
		return s;

	}

	/**
	 * This method returns the plain string without html tags of the given pageSource containing html
	 * Before making changes to this method please talk to Kiran Gavhane 
	 * @param inputString
	 * @return
	 */
	public static String getPlainStringwithouthtml(String inputString)
	{
		String noHtml = inputString.toString().replaceAll("<[^>]*>", "").replaceAll("\t","").replaceAll("\r","");
		String Nospace = noHtml.trim();
		//System.out.println(Nospace);
		return Nospace;
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

		String output = getStringWithinDelimiters(pageSource, startString, endString);
		output = getPlainStringwithouthtml(output);
		return output;

	}

	/**
	 * This method returns the List of substring  between the startString and endString of the given pageSource
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return
	 */
	public static List<String> getListwithinDelimiter(String pageSource,String startString, String endString){

		if(startString == null || startString.length() == 0 || endString == null || endString.length() == 0)
			return Collections.emptyList();	


		ArrayList<String> ls = new ArrayList<String>(); 
		Pattern pattern = Pattern.compile(startString);
		Matcher matcher = pattern.matcher(pageSource);

		while(matcher.find()) {

			int startindex = matcher.start();
			String s = pageSource.substring(startindex);
			String ss = getStringWithinDelimiters(s, startString, endString);

			ls.add(ss);
		}
		//System.out.println(ls);

		return ls;



	}

	/**
	 * This method returns the list of substring without html tag between the startString and endString of the given pageSource
	 * Before making changes to this method please talk to Abhishesk Jambure
	 * @param pageSource
	 * @param startString
	 * @param endString
	 * @return
	 */
	public static List<String> getPlainListWithinDelimiters(String pageSource,String startString, String endString){

		List<String> ls = getListwithinDelimiter(pageSource, startString, endString);
		ls = ls.stream().map(element -> getPlainStringwithouthtml(element)).collect(Collectors.toList());
		System.out.println(ls);
		return ls;		
	}

}