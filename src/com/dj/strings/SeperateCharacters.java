package com.dj.strings;

import java.util.Scanner;

public class SeperateCharacters {

	public static void main(String[] args) {
		System.out.println("Enter the string to seperate on case : ");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		seperateToUpperlowerCases(str);
	}

	private static void seperateToUpperlowerCases(String str) {
		StringBuilder upperCase = new StringBuilder();
		StringBuilder lowerCase = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				lowerCase.append(str.charAt(i));
			}else {
				upperCase.append(str.charAt(i));
			}
		}
		System.out.println("UpperCase : " + upperCase.toString());
		System.out.println("LowerCase : " + lowerCase.toString());
	}

}
