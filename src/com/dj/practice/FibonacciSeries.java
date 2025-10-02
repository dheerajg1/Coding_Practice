package com.dj.practice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to generate Fibonacci series : ");
		Scanner scanner = new Scanner(System.in);
		
		int fib = scanner.nextInt();
		
		int first = 0, second = 1, next;
		for(int i=0; i<fib; i++) {
			System.out.println(first + " ");
			next = second + first;
			first = second;
			second = next;
		}
		scanner.close();
	}

}
