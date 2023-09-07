package com.naveen.day13;

//Program to kick start Abstract Class
abstract class Shape1 {
	abstract void area();

	abstract void myMethod();

	void myMethod2() {
		System.out.println("This is My Method 2");
	}
}

class Rectangle1 extends Shape1 {
	void area() {
		System.out.println("Area : L * B");
	}

	void myMethod() {

	}
}

public class Exercise04 {

	public static void main(String[] args) {

		Shape1 obj = new Rectangle1(); // [Dynamic Method Dispatch]

		obj.area(); // Invoked by Rectangle1 Object because of Overriding.
		obj.myMethod2(); // Invoked by reference of Shape1.

	}

}
