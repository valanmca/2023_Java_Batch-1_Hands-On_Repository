package com.gayathri.day3;

public class StringObjectProgram2 {

	public static void main(String[] args) {
		
		String s1 = "String Program";
		char ch[] = s1.toCharArray();
		for(char c: ch) {
			System.out.println(c);
		}
		
		String s2 ="Wel,come t,o ja,va pro,gram";
		String temp[] = s2.split(",");
		for(String t : temp) {
			System.out.println(t);
		}
	}

}
