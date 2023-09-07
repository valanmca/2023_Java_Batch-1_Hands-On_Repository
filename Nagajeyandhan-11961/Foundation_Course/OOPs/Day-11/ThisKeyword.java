//this Keyword

package com.jeyandhan.day11;

public class ThisKeyword {

	int n;

	ThisKeyword() {
		this(5);
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
		System.out.println("Factorial: " + fact);
	}

	public static void main(String[] args) {
		// object creation

		ThisKeyword obj = new ThisKeyword();

	}

}
