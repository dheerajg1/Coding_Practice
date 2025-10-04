package com.dj.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to confirm if Armstrong");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n, arm = 0, a;

		while(n>0) {
			a = n%10;
			n=n/10;
			arm = arm + a*a*a;
		}
		
		if(arm == temp)
			System.out.println(temp + " is a Armstrong number");
		else
			System.out.println(temp + " is not a Armstrong number");
		s.close();
	}
	
}
