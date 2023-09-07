package com.naveen.day9;

//Types of Variables in java
public class TypesOfVariables {

	int b = 20; // Instance or Object Variable

	static int c = 30; // Static or Class variable

	public static void main(String[] args) {
		int a = 10; // Local variable
		System.out.println(a);

		// Calling the Instance Variables
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.b);

		// Three ways of calling the static variable

		System.out.println(TypesOfVariables.c); // Class Name - Correct way
		// System.out.println(obj.c); // Object
		System.out.println(c); // Direct Access

	}

}
