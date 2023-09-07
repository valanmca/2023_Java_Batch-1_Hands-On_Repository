package com.jeban.OOPsday4;//Constructor overloading with the help of this keyword 

public class polymorphism5 {
	int n;

	polymorphism5() {
		this(5);

	}

	polymorphism5(int n) {
		this.n = n;
		this.findfactorial();

	}

	public void findfactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factoriel:" + fact);
	}

	public static void main(String[] args) {

		polymorphism5 obj = new polymorphism5();

	}

}
