package com.jeban.JavaArray;

//String Class Methods
public class JavaString {

	public static void main(String[] args) {
		String s1="Java";
		String s2="java";
		System.out.println(s1.equals(s2));//false java is case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));//True
		System.out.println(s1.charAt(1));//a
		System.out.println(s2.charAt(2));//v
		System.out.println(s1.indexOf('a'));//display first preference index value
		System.out.println(s1.lastIndexOf('a'));//display last preference index value
		System.out.println(s1.length());//4-->display length of the string
		System.out.println(s1.replace('a', 'z'));//Jzvz
		System.out.println(s1.concat(" World"));//Java World
		System.out.println(s1.toUpperCase());//JAVA
		System.out.println(s1.toLowerCase());//java
		
		String s3="Java World";
		System.out.println(s3.substring(3,7));//a Wo
		System.out.println(s3.substring(3));//a World
		
		
		
		

	}

}
