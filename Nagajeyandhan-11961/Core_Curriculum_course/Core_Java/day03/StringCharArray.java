package com.jeyandhan.day03;

public class StringCharArray {

	public static void main(String[] args) {
		String s1 = "Java";
		char ch[] = s1.toCharArray();
		
		System.out.println("\nCharacters in the array\n");
		for(char c : ch) {
			System.out.println(c);
		}
		
		String s2 = "Welcome to my home";
		String temp[] = s2.split(" ");
		
		System.out.println("\nWords in the array\n");
		for(String s : temp) {
			System.out.println(s);
		}
	}

}
