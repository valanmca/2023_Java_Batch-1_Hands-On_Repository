/************* Implementing Multiple Interfaces... ***********/
package com.sara.day14;
//Interfaces

interface MyInterface1 {
	void addition(int a, int b); // By Default it will be Abstract and Public Class...

	void subtraction(int a, int b);
}

interface MyInterface2 {
	void multiplication(int a, int b); // By Default it will be Abstract and Public Class...

	void division(int a, int b);
}

class Calculator1 implements MyInterface1, MyInterface2 {
	public void addition(int a, int b) {
		System.out.println("Additon of the Given Numbers is : " + (a + b));

	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction of the Given Numbers is : " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication of the Given Numbers is : " + (a * b));

	}

	public void division(int a, int b) {
		System.out.println("Division of the Given Numbers is : " + (a / b));
	}

}

public class Interfaces_Ex02 {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(5, 5);
		obj.division(20, 2);

	}

}
