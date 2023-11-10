package com.madhan.coreday3;

public class JavaString {

	public static void main(String[] args) {
		String s1="Java";
		String s2="java";
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.charAt(1)); //a
		System.out.println(s1.indexOf('a')); //1
		System.out.println(s1.lastIndexOf('a')); //3
		System.out.println(s1.length()); //4
		System.out.println(s1.replace('a','Q')); //JQvQ
		System.out.println(s1.concat("World")); //JavaWorld
		System.out.println(s1.toUpperCase()); //JAVA
		System.out.println(s1.toLowerCase()); //java
		
		String s3="Madhan";
		System.out.println(s3.substring(3,5)); //ha
		System.out.println(s3.substring(3)); //han
		
		

	}

}
