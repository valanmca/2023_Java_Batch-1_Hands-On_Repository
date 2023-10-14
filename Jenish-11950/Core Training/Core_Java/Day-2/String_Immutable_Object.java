package com.jenish.day2;

//String are Immutable Objects in Java

public class String_Immutable_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		s1 = s1.concat("World"); //Unreferenced object
		System.out.println(s1); //Java World
		
		s1 = s1. toUpperCase(); //reference to s1
		System.out.println(s1); //JAVAWORLD

	}

}
