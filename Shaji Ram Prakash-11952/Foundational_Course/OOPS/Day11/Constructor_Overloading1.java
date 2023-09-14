package com.shaji.Day11;

public class Constructor_Overloading1 {
	public Constructor_Overloading1 (String Name) {
		this(5);
		System.out.println("Welcome " + Name);
	}

	public Constructor_Overloading1(int n) {
		this(14,24);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}

	public Constructor_Overloading1(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);

	}

	public static void main(String[] args) {
		Constructor_Overloading1 obj = new Constructor_Overloading1("Shaji");

	}

}
