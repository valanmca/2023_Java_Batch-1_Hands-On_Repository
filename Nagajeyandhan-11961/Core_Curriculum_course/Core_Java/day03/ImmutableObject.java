package com.jeyandhan.day03;

// Strings are immutable objects in java

public class ImmutableObject {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat("World"); //unreferenced object
		System.out.println(s1); // Java 

		s1 = s1.concat("World"); // reassigning to s1
		System.out.println(s1); // Java World
	}

}
