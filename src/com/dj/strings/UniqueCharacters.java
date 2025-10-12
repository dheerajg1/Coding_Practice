package com.dj.strings;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueChar("aabbcc");
	}

	private static void uniqueChar(String str) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap();
		char c[] = str.toCharArray();
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			if(!map.containsKey(c[i]) && c[i]!=' ') {
				map.put(c[i], counter++);
			}else {
				//do nothing
			}
		}
		for(Character key: map.keySet()) {
			System.out.println(key + " and value is : " + map.get(key));
		}
	}

}
