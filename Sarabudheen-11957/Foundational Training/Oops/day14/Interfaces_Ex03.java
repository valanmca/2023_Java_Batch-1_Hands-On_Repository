/***** Overriding the Interfaces... *****/
package com.sara.day14;

//Interfaces

interface MyInterface3 {
	void addition(int a, int b); // By Default it will be Abstract and Public Class...

	void subtraction(int a, int b);
}

interface MyInterface4 extends MyInterface3 {
	void multiplication(int a, int b); // By Default it will be Abstract and Public Class...

	void division(int a, int b);
}

class Calculator2 implements MyInterface4 {
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

public class Interfaces_Ex03 {

	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(5, 5);
		obj.division(20, 2);

	}

}
