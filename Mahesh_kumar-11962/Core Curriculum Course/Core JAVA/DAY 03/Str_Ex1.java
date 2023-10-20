package com.mahesh.core_java_day_03;

public class Str_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "JAVA";
		String s2 = "java";
		
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.charAt(1));//A
		System.out.println(s2.charAt(3));// a
		System.out.println(s1.indexOf('V')); //2
		System.out.println(s1.lastIndexOf('A')); //3
		System.out.println(s1.length());//4
		System.out.println(s1.replace('J','M')+"  "+s1.replace('A', 'I'));//MAVA JIVI
		System.out.println(s1.concat(" LANGUAGE")); // JAVA LANGUAGE
		System.out.println(s1.toLowerCase());// java
		System.out.println(s2.toUpperCase());// JAVA
		
		String s3 = "JAVA WORLD";
		System.out.println(s3.substring(3,8));//A WOR
		System.out.println(s3.substring(3));//A WORLD
		

	}

}
