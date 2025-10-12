package com.dj.strings;

import java.util.Scanner;

public class AlphaNumbericSplit {

	public static void main(String[] args) {
		System.out.println("Enter the string to seperate on case : ");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		seperateAlphaNumeric(str);
	}

	private static void seperateAlphaNumeric(String str) {
		StringBuilder alpha = new StringBuilder();
		StringBuilder numeric = new StringBuilder();
		
		for(int i=0;i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				numeric.append(str.charAt(i));
			}else {
				alpha.append(str.charAt(i));
			}
		}
		System.out.println("Alpha : " + alpha.toString());
		System.out.println("Numeric : " + numeric.toString());
	}

}
