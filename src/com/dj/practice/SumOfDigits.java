package com.dj.practice;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no. to calculate sum : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int sum = 0;
		int reminder;
		int iteration=1;
		while(n>0) {
			reminder = n%10;
			System.out.println("Reminder for iteration " + iteration + " :" + reminder);
			sum = sum + reminder;
			System.out.println("Sum for iteration " + iteration + " :" + sum);
			n=n/10;
			System.out.println("n value for Iteration " + iteration + " :" + n);
			iteration++;
		}
		System.out.println("Sum of the entered no is : " + sum);
		s.close();
	}

}
