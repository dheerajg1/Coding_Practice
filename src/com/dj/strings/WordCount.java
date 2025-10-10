package com.dj.strings;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wordCount("Java Automation Test Automation");
	}

	private static void wordCount(String string) {
		// TODO Auto-generated method stub
		String str[] = string.split(" ");
		Map<String, Integer> map = new HashMap();
		
		for(String s: str) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s,1);
			}
		}
		System.out.println("Repeated words count in the given string is : " + map);
	
	}

}
