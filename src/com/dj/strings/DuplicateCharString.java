package com.dj.strings;

public class DuplicateCharString {

	public static void main(String[] args) {
		duplicateString("hello");
	}

	private static void duplicateString(String str) {
		char c[] = str.toCharArray();
		StringBuilder duplicateStr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			duplicateStr.append(c[i]).append(c[i]);
		}
		System.out.println("Duplicated String : " + duplicateStr);
	}

}
