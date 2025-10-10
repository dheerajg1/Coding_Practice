package com.dj.strings;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to get reverse of each word : ");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		String reverseStr = "";
		String words[] = str.split(" ");
		for(int i = 0; i< words.length ; i++) {
			String word = words[i];
			String reverseWord = "";
			char ch;
			for(int j=0; j< word.length(); j++) {
				ch = word.charAt(j);
				reverseWord = ch + reverseWord;
			}
			reverseStr = reverseStr + reverseWord + " ";
			
		}
		System.out.println(reverseStr);
		
		scanner.close();
	}

}
