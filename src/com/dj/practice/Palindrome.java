package com.dj.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. to find out if palindrome : ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int reverse=0, reminder;
		while(n>0) {
			reminder = n%10;
			reverse = reverse*10 + reminder;
			n = n/10;
		}
		System.out.println("Reverse : " + reverse);
		System.out.println("temp : " + temp);
		if(reverse == temp) {
			System.out.println(temp + " is a palindrome number");
		}else 
			System.out.println(temp + " is not a palindrome number");
		
		s.close();
	}

}
