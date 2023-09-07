package com.domnic.oopsday4;

public class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Hello " + name);
	}

	void myMethod(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial :" + fact);
	}

	void myMethod(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod("Domnic");
		obj.myMethod(4);
		obj.myMethod(4, 9);
	}

}
