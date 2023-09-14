package com.shaji.Day14;

//Interfaces
interface myInterface3 {
	void addition(int a, int b);// abstract,public

	void subtraction(int a, int b);
}

interface myInterface4 extends myInterface3 {
	void multiplication(int a, int b);// abstract,public

	void division(int a, int b);
}

class Calculator2 implements myInterface4 {
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

public class Interface2 {

	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		obj.addition(14, 24);
		obj.subtraction(14, 24);
		obj.multiplication(14, 24);
		obj.division(14, 24);

	}

}
