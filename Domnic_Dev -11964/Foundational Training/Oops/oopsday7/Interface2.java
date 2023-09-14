package com.domnic.oopsday7;
//inheriting 2 interface
interface MyInterface3 { 
	void addition(int a, int b);

	void substraction(int a, int b);
}

interface MyInterface4 extends MyInterface3{
	void multiplication(int a, int b);

	void division(int a, int b);
}

class Calculator2 implements MyInterface4 {
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

public class Interface2 {

	public static void main(String[] args) {
		MyInterface4 obj = new Calculator2();
		obj.addition(10, 9); 
		obj.substraction(9, 4);
		obj.multiplication(7, 5);
		obj.division(24, 4);

	}

}
