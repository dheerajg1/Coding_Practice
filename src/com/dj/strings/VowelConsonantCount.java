package com.dj.strings;

public class VowelConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vccount("aeiou");
	}

	private static void vccount(String str) {
		// TODO Auto-generated method stub
		char c[] = str.toLowerCase().toCharArray();
		int vowels=0, consonants = 0;
		for(int i=0; i<str.length(); i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
				vowels++;
			}else if(c[i]==' ') {
				//do nothing
			}else {
				consonants++;
			}
		}
		System.out.println("No.of vowels : " + vowels);
		System.out.println("No.of consonants : " + consonants);
	}

}
