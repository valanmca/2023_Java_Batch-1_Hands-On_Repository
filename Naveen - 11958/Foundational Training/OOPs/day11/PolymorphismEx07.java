package com.naveen.day11;

//constructor Overloading polymorphism using this keyword.
class MyClass3 {
	int n;

	MyClass3() {
		this(5);
	}

	MyClass3(int n) {
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
}

public class PolymorphismEx07 {

	public static void main(String[] args) {
		MyClass3 obj = new MyClass3();

	}

}
