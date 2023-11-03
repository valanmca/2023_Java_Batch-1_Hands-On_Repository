package com.naveen.day2;

/*String Class Methods*/
public class Ex03 {

	public static void main(String[] args) {
		String s1 = "Java";
		char ch[] = s1.toCharArray(); //It will convert the string to character array.
		for(char c : ch) {
			System.out.println(c);
		}
		
		String s2 = "Welcome to Java program";
		String temp[] = s2.split(" "); //by using any delimeter it can be any value or character.
		for(String t : temp) {
			System.out.println(t);
		}
		
	}
}
