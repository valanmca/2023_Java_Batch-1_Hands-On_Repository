/***** Example2 for Constructor Overloading...  *****/
package com.sara.day11;

class Constructor_Overloading1 {

	Constructor_Overloading1(String name) {
		this(5);
		System.out.println("Welcome " + name);
	}

	Constructor_Overloading1(int n) {
		this(10, 20);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial " + fact);

	}

	Constructor_Overloading1(int a, int b) {
		int sum = a + b;
		System.out.println("Sum " + sum);
	}

}

public class Polymorphism_Ex05 {

	public static void main(String[] args) {
		Constructor_Overloading1 obj = new Constructor_Overloading1("Sara");

	}

}
