package com.dharshu.day2;

public class Char_String_Array {

	public static void main(String[] args) {
		String s1="Dharshu Alagar";
		char ch[]=s1.toCharArray(); // converting the string into character array
		for (char c : ch) { // for each method
			System.out.println(c);
		}
		
		String s2 = "Welcome to Java Program";
		String temp[] = s2.split(" "); // it will display the word by word.
		for ( String t: temp) {
			System.out.println(t);
		}
		
		String s3 = "Welcome to Java Program";
		String temp1[] = s3.split("J"); // it eliminate "j" -- welcome to 
		                                                    // -- ava Program
		for ( String t: temp1) {
			System.out.println(t);
		}

	}

}
