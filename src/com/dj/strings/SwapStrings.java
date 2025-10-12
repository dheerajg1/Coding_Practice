package com.dj.strings;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String s1 = scanner.nextLine();
		System.out.println("Enter second string : ");
		String s2 = scanner.nextLine();

		System.out.println("------------ Before swapping --------------- ");
		System.out.println("String1 : " + s1);
		System.out.println("String2 : " + s2);
		
		s1 = s1+s2;
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length(), s1.length());
		
		System.out.println("------------ After swapping --------------- ");
		System.out.println("String1 : " + s1);
		System.out.println("String2 : " + s2);
		scanner.close();
	}

}
