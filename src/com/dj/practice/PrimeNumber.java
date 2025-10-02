package com.dj.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = scanner.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num + " is a prime number");
		}else
			System.out.println(num + " is not a prime number");
		scanner.close();

	}
	
	public static boolean isPrime(int n){
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
