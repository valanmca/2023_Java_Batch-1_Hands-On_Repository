/*********** Method Overloading... *************/
//Compile Time Polymorphism
package com.sara.day11;

/******** Polymorphism - Example for Method Overloading... *******/
class Polymorphism {

	void myMethod(String name) {
		System.out.println("Welcome " + name);
	}

	void myMethod(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial " + fact);

	}

	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Sum " + sum);
	}

}

public class Polymorphism_Ex01 {

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.myMethod("Sara");
		obj.myMethod(5);
		obj.myMethod(10, 5);

	}

}
