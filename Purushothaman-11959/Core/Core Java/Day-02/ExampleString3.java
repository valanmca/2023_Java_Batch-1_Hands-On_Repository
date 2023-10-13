package com.purushoth.day_02;

public class ExampleString3 {

	public static void main(String[] args) {
		String s1="Java";
		
		s1.concat(" World");        //Because it will create new address to save
		System.out.println(s1);//Java
		
		s1=s1.concat(" World");     //If we create reference then it will modify
		System.out.println(s1);//Java World
		
		s1.toUpperCase();
		System.out.println(s1);//Java World
		
		s1=s1.toUpperCase();
		System.out.println(s1);//JAVA WORLD

	}

}//String are Immutable objects in java because
