package com.shiva.core.day02;

//Strings are Immutable object in Java
public class String_Immutable {

	public static void main(String[] args) {
		String s1="Java";
		s1=s1.concat("World");
		System.out.println(s1);//Java World
		
		s1=s1.toUpperCase();
		System.out.println(s1);//Java World
	}

}
