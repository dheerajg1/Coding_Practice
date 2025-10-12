package com.dj.strings;

import java.util.Scanner;

public class RepeatedCharCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string in format <aaabbccc> : ");
		
		String str = scanner.nextLine();
		System.out.println("Repeated char count of given string is : " + getRepeatedCharCount(str));
	}

	private static String getRepeatedCharCount(String str) {
		StringBuilder charCounterStr = new StringBuilder();
		int count=1;
		
		for(int i=0; i<str.length(); i++) {
			if(i+1 < str.length() && str.charAt(i+1) == str.charAt(i)) {
				count++;
			}else {
				charCounterStr.append(str.charAt(i)).append(count);
				count=1;
			}
		}
		
		return charCounterStr.toString();
	}

}
