package com.gayathri.day1;

class calc {
	int number1, number2;
	static int n1,n2;

	calc(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	void Addition() {
		System.out.println("\nAdding two values : "+(number1 + number2));
	}
	void Subtraction() {
		System.out.println("\nSubtracting two values : "+(number1 - number2));
	}
	static void multiplication(int n1,int n2) {
		System.out.println("\nMultiplication of two values : "+(n1 * n2));
	}
	static void division(int n1,int n2) {
		System.out.println("\nDivision of two values : "+(n1 / n2));
	}

}

public class Calculator {

	public static void main(String[] args) {

		//instance methods
		calc referenceName = new calc(100, 10);
		referenceName.Addition();
		referenceName.Subtraction();

		//	static method
		calc.multiplication(10,89);
		calc.division(34, 2);
	}

}

