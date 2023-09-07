//Implementing multiple Interface

package com.jeyandhan.day14;

//Interface1

interface Arithmetic1 {

	void addition(int a, int b); //by default abstract , public

	void subtraction(int a, int b);

}

//Interface2
interface Arith1 {

	void multiplication(int a, int b); //by default abstract , public

	void division(int a, int b);
}

class Calculator1 implements Arithmetic1, Arith1 {

	public void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("Multiplication: " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Division: " + (a / b));
	}
}

public class ArithmeticInterface {

	public static void main(String[] args) {
		// object creation
		Calculator1 obj = new Calculator1();

		// method calling
		obj.addition(13, 15);

		obj.subtraction(14, 4);

		obj.multiplication(5, 5);

		obj.division(10, 5);

	}

}
