/************ Creating Method for Factorial and Digitcount...*************/
package com.sara.day09;

public class Methods_Ex1 {

	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i < n + 1; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of " + n + " is : " + fact);
	}

	static void digitCount(int num) {
		int count = 0;
		while (num != 0) {
			num /= 10;// n = n/10;
			count++;

		}
		System.out.println("The number of Digits is : " + count);
	}

	public static void main(String[] args) {
		Methods_Ex1 obj = new Methods_Ex1();
		obj.factorial(5);

		Methods_Ex1.digitCount(1234);

	}

}
