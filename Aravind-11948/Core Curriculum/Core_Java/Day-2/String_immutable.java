package com.core.day_02;

// Strings are immutable objects in java
public class String_immutable {

	public static void main(String[] args) {

		String s1 = "Java";
		s1.concat(" World"); // these updates happen in separate memory location

		System.out.println(s1); // java (string cannot be changed) we have to reassign the string

		s1 = s1.concat(" World"); // java world

		System.out.println(s1);// disadvantage =memory allocation
		
		// for this we have the String buffer

	}

}
