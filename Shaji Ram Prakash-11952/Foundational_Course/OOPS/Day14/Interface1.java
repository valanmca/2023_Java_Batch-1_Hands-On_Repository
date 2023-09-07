package com.shaji.Day14;

//Interfaces
interface myInterface1 {
	void addition(int a, int b);// abstract,public

	void subtraction(int a, int b);
}

interface myInterface2 {
	void multiplication(int a, int b);// abstract,public

	void division(int a, int b);
}

class Calculator1 implements myInterface1, myInterface2 {
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

public class Interface1 {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		obj.addition(14, 24);
		obj.subtraction(14, 24);
		obj.multiplication(14, 24);
		obj.division(14, 24);

	}

}
