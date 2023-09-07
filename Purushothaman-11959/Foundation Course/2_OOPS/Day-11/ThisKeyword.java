package com.purushoth.day11;

public class ThisKeyword {
	int n;

	ThisKeyword() {
		this(6);
	}

	ThisKeyword(int n) {
		this.n = n;
		this.findFactorial();
	}

	public void findFactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}

	public static void main(String[] args) {//this keyword can't be used in static method
		ThisKeyword obj = new ThisKeyword();

	}

}
