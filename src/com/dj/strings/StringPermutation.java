package com.dj.strings;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Possible permutations count : " + permute("dhee", ""));
	}
	static int counter = 0;
	private static int permute(String str, String prefix) {
		
		// TODO Auto-generated method stub
		if(str.length() == 0) {
			System.out.println(prefix);
			counter++;
		}else {
			for(int i=0; i<str.length(); i++) {
//				System.out.println("-----------" + i + " :" + str.substring(0,i) );
//				System.out.println("###########" + i + " :" + str.substring(i+1) );
				String rem = str.substring(0,i) + str.substring(i+1);
//				System.out.println("$$$$$$$$$$$ rem" + i + " :" + rem );
//				System.out.println("$$$$$$$$$$$ prefix" + i + " :" + prefix);
//				System.out.println("$$$$$$$$$$$ prefix+strCharAt" + i + " :" + prefix+str.charAt(i) );
				permute(rem, prefix+str.charAt(i));
				
			}
		}
		return counter;
	}

}
