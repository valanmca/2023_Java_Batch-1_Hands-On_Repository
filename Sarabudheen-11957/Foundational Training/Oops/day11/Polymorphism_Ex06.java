/***** Example for This Method...  *****/
package com.sara.day11;

class Constructor_Overloading2 {
	int n;

	Constructor_Overloading2() {
		this(5);
	}

	Constructor_Overloading2(int n) {
		this.n = n;
		this.findFactorial();

	}

	public void findFactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial : " + fact);
	}
}

public class Polymorphism_Ex06 {

	public static void main(String[] args) {
		Constructor_Overloading2 obj = new Constructor_Overloading2();

	}

}
