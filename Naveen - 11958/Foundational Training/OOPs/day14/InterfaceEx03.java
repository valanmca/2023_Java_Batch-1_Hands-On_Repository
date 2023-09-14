package com.naveen.day14;
// By Default Interface method are public and abstract.

// To Implement program for interface to interface.

interface MyInterface3 {
	void addition(int a, int b);

	void subtraction(int a, int b);
}

interface MyInterface4 extends MyInterface3 { // Inheritance..
	void multiplication(int a, int b);

	void division(int a, int b);
}

class Calculator2 implements MyInterface4 { // Using extends keyword now we can initialize only subclass of interface.
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Division : " + (a / b));
	}
}

public class InterfaceEx03 {

	public static void main(String[] args) {

		Calculator2 obj = new Calculator2(); // While Using the Multiple interfaces we can able to call all the
												// Methods using creation of sub class object alone.
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(10, 20);
		obj.division(20, 10);
	}
}
