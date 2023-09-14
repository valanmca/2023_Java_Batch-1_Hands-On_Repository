package com.naveen.day9;

import java.util.Scanner;

public class MethodEx01 {

	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial of " + n + " is : " + fact);
	}

	static void digitCount(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("The total Digits is :" + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n = sc.nextInt();

		MethodEx01.digitCount(n);

		MethodEx01 obj = new MethodEx01();
		obj.factorial(n);

		sc.close();

	}

}
