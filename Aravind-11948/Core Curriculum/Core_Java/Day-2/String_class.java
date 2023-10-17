package com.core.day_02;
// String class default methods
import java.util.Scanner;

public class String_class {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1="Java";
		String s2="java";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.charAt(1));//a
		System.out.println(s1.indexOf('a'));//1
		System.out.println(s1.lastIndexOf('a'));//3
		System.out.println(s1.length());//4
		System.out.println(s1.replace('a','z' ));//Jzvz
		System.out.println(s1.concat(" world"));// Java world
		System.out.println(s1.toUpperCase());//JAVA
		System.out.println(s1.toLowerCase());//java
		
		String s3="Java World";
		System.out.println(s3.substring(3,7));// a wo
		System.out.println(s3.substring(3));// a world
		
		
		
		

	}

}
