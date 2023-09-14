/***** Example1 for Constructor Overloading...  *****/
package com.sara.day11;

class Constructor_Overloading {

	void Constructor_Overloading(String name) {
		System.out.println("Welcome " + name);
	}

	void Constructor_Overloading(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial " + fact);

	}

	void Constructor_Overloading(int a, int b) {
		int sum = a + b;
		System.out.println("Sum " + sum);
	}

}

public class Polymorphism_Ex04 {

	public static void main(String[] args) {

		Constructor_Overloading obj = new Constructor_Overloading();

		obj.Constructor_Overloading("Sara");
		obj.Constructor_Overloading(5);
		obj.Constructor_Overloading(10, 20);

	}

}
