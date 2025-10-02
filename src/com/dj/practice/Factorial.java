package com.dj.practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to get factorial : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("Factorial of the given number is " + factorial(n));
		s.close();
	}
	
	public static int factorial(int n) {
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial * i;	
		}
		return factorial;
	}

}
