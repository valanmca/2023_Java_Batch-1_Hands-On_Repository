package com.naveen.day14;
// By Default Interface method are public and abstract.

// Simple Addition and Subtraction program using Interface.

interface MyInterface {
	void addition(int a, int b);

	void subtraction(int a, int b);
}

class Calculator implements MyInterface {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}
}

public class InterfaceEx01 {

	public static void main(String[] args) {

		MyInterface obj = new Calculator();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
	}

}
