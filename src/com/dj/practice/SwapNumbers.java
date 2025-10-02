package com.dj.practice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number x : ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		System.out.println("Enter number y : ");
		s = new Scanner(System.in);
		int y = s.nextInt();
		
		System.out.println("Numbers before swapping - x = " + x + " | y = " + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Numbers after swapping - x = " + x + " | y = " + y);
		
	
	}

}
