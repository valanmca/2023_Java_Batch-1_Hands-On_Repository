package com.naveen.day14;
// By Default Interface method are public and abstract.

// To Implement multiple interfaces using Calculator  program

interface MyInterface1 {
	void addition(int a, int b);

	void subtraction(int a, int b);
}

interface MyInterface2 {
	void multiplication(int a, int b);

	void division(int a, int b);
}

class Calculator1 implements MyInterface1, MyInterface2 { // A normal class can have n no of interfaces.
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

public class InterfaceEx02 {

	public static void main(String[] args) {

		Calculator1 obj = new Calculator1(); // While Using the Multiple interfaces we can able to call all the
												// Methods using creation of sub class object alone.
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(10, 20);
		obj.division(20, 10);
	}
}
