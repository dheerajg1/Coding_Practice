package com.dj.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "liril";
		String rev = "";
		for(int i=str.length(); i>0; i--) {
			rev = rev + str.charAt(i-1);
		}
		
		if(str.contentEquals(rev)) {
			System.out.println("String $" + rev + "$ is palindrome");
		}else {
			System.out.println("String $" + rev + "$ is not a palindrome");
		}
		
	}

}
