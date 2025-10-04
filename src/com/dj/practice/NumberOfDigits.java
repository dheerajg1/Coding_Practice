package com.dj.practice;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to find out no.of digits : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp=n, a = 0;
		if(n<0) {
			n = n * -1;
		}else if(n==0) {
			n = 1;
		}
		
		while(n>0) {
			n = n/10;
			a++;
		}
		System.out.println("Number of Digits for " + temp + " is " + a);
		s.close();
	
	}

}
