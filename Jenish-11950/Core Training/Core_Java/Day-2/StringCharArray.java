package com.jenish.day2;

//String Class Methods
//String Char Array

public class StringCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		char ch[] = s1.toCharArray();
		for(char c : ch) { //for each method
			System.out.println(c);
		}
		String s2 = "Welcome to Java Program";
		String temp[] = s2.split(" ");
		for(String t : temp) {
			System.out.println(t);
		}
			
	}

}
