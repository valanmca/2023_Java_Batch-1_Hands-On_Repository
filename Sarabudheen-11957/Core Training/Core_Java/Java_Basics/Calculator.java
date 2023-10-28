/***** Java program for simple calculator *****/
package com.sara.CoreJava.Day_01;

public class Calculator {

	// Variables

	int num_1;
	int num_2;

	// constructor

	Calculator(int num_1, int num_2) {
		System.out.println(" ");
		this.num_1 = num_1;
		this.num_2 = num_2;
	}

	// Methods
	void add() {
		System.out.println("Addition of " + num_1 + " and " + num_2 + " is : " + (num_1 + num_2));
	}

	void sub() {
		System.out.println("Subraction of " + num_1 + " and " + num_2 + " is : " + (num_1 - num_2));
	}

	void mul() {
		System.out.println("Multiplication of " + num_1 + " and " + num_2 + " is : " + (num_1 * num_2));
	}

	void div() {
		System.out.println("Division of " + num_1 + " and " + num_2 + " is : " + (num_1 / num_2));
	}

	public static void main(String[] args) {
		Calculator obj1 = new Calculator(100, 20);
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();

		Calculator obj2 = new Calculator(200, 50);
		obj2.add();
		obj2.sub();
		obj2.mul();
		obj2.div();

	}

}
