package com.purushoth.day_02;

public class ExampleString2 {

	public static void main(String[] args) {
		String s1="Java";
		char ch[]=s1.toCharArray();
		/*for(char c:ch) {
			System.out.println(c);
		}*/
		for (int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		String s2="Welcome to Java Program";
		String temp[]=s2.split("J");
		for (String t:temp) {
			System.out.println(t);
		}

	}

}//String to iterate in characters & to split 
