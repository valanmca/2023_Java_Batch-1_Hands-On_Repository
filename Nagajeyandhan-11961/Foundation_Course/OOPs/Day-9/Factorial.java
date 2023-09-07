//Factorial and DigitCount

package com.jeyandhan.day09;

public class Factorial {

	void factorial(int n) { // instance method
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial: " + fact);
	}

	static void digitCount(int n) { // static method
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("DigitCount:" + count);
	}

	public static void main(String[] args) {
		Factorial obj = new Factorial();

		obj.factorial(5); // instance method calling
		Factorial.digitCount(5679); // static method calling

	}

}
