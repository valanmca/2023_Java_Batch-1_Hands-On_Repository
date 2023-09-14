//Implementing two interface with extends keyword

package com.jeyandhan.day14;

//Interface1

interface Arithmetic2 {

	void addition(int a, int b); // by default abstract , public

	void subtraction(int a, int b);

}

//Interface2
interface Arith2 extends Arithmetic2 {

	void multiplication(int a, int b); // by default abstract , public

	void division(int a, int b);
}

class Calculator2 implements Arith2 {

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

public class Interfaces {

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