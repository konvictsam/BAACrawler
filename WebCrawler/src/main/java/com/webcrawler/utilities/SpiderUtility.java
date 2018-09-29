package com.webcrawler.utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Asus
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
}