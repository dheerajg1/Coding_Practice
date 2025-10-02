package com.dj.practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to reverse : ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev = 0, reminder;
		while(num>0) {
			reminder = num%10;
			rev = rev*10 + reminder;
			num = num/10;
		}
		s.close();
	}

}
