package com.domnic.day9;

public class Oops10 {
	void factorial(int num) {

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

	static void digitCount(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("The count is "+count);
	}

	public static void main(String[] args) {
		Oops10 fact = new Oops10();
		fact.factorial(6);
		Oops10.digitCount(546);
	}

}
