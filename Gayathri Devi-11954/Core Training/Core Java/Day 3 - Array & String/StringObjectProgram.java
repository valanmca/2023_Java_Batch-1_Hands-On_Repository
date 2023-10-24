package com.gayathri.day3;

public class StringObjectProgram {

	public static void main(String[] args) {
		
		String s1 = "gayathri";//string literal
		String s2 = "GAYATHRI";
		
		String s4 = new String("Devi"); //object creation method
		System.out.println(s4); 
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.charAt(5));//h
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//3
		System.out.println(s1.length());//8
		System.out.println(s1.replace('a', 'z'));//gzyzthri
		System.out.println(s1.concat(" World"));//gayathri world
		System.out.println(s2.toLowerCase());//s2 = gayathri
		System.out.println(s1.toUpperCase());//s1 = GAYATHRI
		
		String s3 = "Java World";
		System.out.println(s3.substring(3,7));//a wo
		System.out.println(s3.substring(3));//a world		
	}

}


