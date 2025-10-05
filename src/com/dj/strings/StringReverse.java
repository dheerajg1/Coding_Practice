package com.dj.strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		char c;
		String rev= "";
		for(int i=0; i< str.length(); i++) {
			c = str.charAt(i);
			System.out.println("Iteration " + i + " and the value is : " + c);
			rev = c + rev;
			System.out.println("Iteration " + i + " and the rev value is : " + rev);
		}
		
		System.out.println("Reversed string is : " + rev);
		s.close();
	}

}
