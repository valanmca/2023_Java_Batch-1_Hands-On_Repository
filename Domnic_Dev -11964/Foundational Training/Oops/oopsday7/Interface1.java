package com.domnic.oopsday7;

//Multiple Interface
interface MyInterface1 { // interface are by default abstract public
	void addition(int a, int b);

	void substraction(int a, int b);
}

interface MyInterface2 {
	void multiplication(int a, int b);

	void division(int a, int b);
}

class Calculator1 implements MyInterface1, MyInterface2 {
	public void addition(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("Substraction of " + a + " and " + b + " is " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Substraction of " + a + " and " + b + " is " + (a / b));
	}

}

public class Interface1 {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();// here we had create object for subclass because we have 2 interfaces
		obj.addition(4, 9); // if we create object for 1 interface another interface methods cannot be accessed so we create object with subclass
		obj.substraction(7, 4);
		obj.multiplication(5, 5);
		obj.division(10, 5);

	}

}
