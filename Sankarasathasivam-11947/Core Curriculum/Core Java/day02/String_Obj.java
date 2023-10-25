package com.shiva.core.day02;
//String class methods
public class String_Obj {

	public static void main(String[] args) {
		String s1="Java";
		String s2="java";
		
		System.out.println(s1.equals(s2));//False --> Case Sensitive
		System.out.println(s1.equalsIgnoreCase(s2));//True
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.indexOf("a"));//1 (First index value)
		System.out.println(s1.lastIndexOf("a"));//3 
		System.out.println(s1.length());//4
		System.out.println(s1.replace('a', 'o'));//Jovo
		System.out.println(s1.concat("World"));//JavaWorld
		System.out.println(s1.toUpperCase());//JAVA
		System.out.println(s1.toLowerCase());//java
		
		String s3="Java World";
		System.out.println(s3.substring(3,7));// a Wo
		System.out.println(s3.substring(3));// a World
		
	}

}
