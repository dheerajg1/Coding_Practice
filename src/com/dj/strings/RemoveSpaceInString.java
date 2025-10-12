package com.dj.strings;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeSpaces("This is dheeraj");
	}

	private static void removeSpaces(String str) {
		// TODO Auto-generated method stub
		char c[]= str.toCharArray();
		String strWithNoSpace = " ";
		for(int i=0; i<str.length(); i++) {
			if(c[i]==' ') {
				
			}else {
				strWithNoSpace = strWithNoSpace + c[i];
			}
		}
		System.out.println(strWithNoSpace);
	}

}
