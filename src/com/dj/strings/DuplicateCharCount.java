package com.dj.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateCharCount("Java hands on in progerss.....");
	}

	private static void duplicateCharCount(String string) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> charCountMap = new HashMap();
		char ch[] = string.toCharArray();
		for(char c: ch) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		
//		System.out.println("No.of characters in the string : " + string);
//		Iterator<Map.Entry<Character, Integer>> iterator = charCountMap.entrySet().iterator();
//		while(iterator.hasNext()) {
//			Map.Entry<Character, Integer> entry = iterator.next();
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
		
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("No.of characters in the string : " + string);
		for(Character c1: charsInString) {
			if(charCountMap.get(c1)>1) {
				System.out.println(c1 + " : " + charCountMap.get(c1));
			}
		}
		
	}

}
