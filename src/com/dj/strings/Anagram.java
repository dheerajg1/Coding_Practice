package com.dj.strings;

import java.util.ArrayList;

public class Anagram {
	
	static ArrayList<String> dynamicArray = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "listen";
		String str2 = "dheeraj";
		ArrayList<String> combinations = new ArrayList<>();
		combinations = permute(str1, "");
		
		if(combinations.contains(str2)) {
			System.out.println("Given words are anagrams");
		}else {
			System.out.println("Given words are not anagrams");
		}
	}

	private static ArrayList<String> permute(String str1, String prefix) {
		if(str1.length() == 0) {
			dynamicArray.add(prefix);
		}else {
			for(int i=0; i<str1.length(); i++) {
				String rem = str1.substring(0,i) + str1.substring(i+1);
				permute(rem, prefix + str1.charAt(i));
			}
		}
		return dynamicArray;
	}

}
