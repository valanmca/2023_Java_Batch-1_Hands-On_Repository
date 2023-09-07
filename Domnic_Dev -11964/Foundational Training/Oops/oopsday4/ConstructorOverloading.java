package com.domnic.oopsday4;

public class ConstructorOverloading {
	public ConstructorOverloading (String name) {
		System.out.println("Hello " + name);
	}

	public ConstructorOverloading(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial :" + fact);
	}

	public ConstructorOverloading(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading("Domnic");
		ConstructorOverloading obj2 = new ConstructorOverloading(5);
		ConstructorOverloading obj3 = new ConstructorOverloading(10,20);
		
	}

}
