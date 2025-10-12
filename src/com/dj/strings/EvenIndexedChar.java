package com.dj.strings;

public class EvenIndexedChar {

	public static void main(String[] args) {
		
		printEvenIndexedChar("abcdef");
	}

	private static void printEvenIndexedChar(String str) {
		char[] c = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(i%2==0) {
				System.out.println(c[i]);
			}
		}
	}

}
