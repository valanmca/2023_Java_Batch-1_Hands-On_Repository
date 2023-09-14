package com.domnic.oopsday4;

public class ConstructorOverloading2 {
	public ConstructorOverloading2 (String name) {
		this(5);
		System.out.println("Hello " + name);
	}

	public ConstructorOverloading2(int n) {
		this(5,10);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial :" + fact);
	}

	public ConstructorOverloading2(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void main(String[] args) {
		ConstructorOverloading2 obj1 = new ConstructorOverloading2("Domnic");
		//ConstructorOverloading2 obj2 = new ConstructorOverloading2(5);
		//ConstructorOverloading2 obj3 = new ConstructorOverloading2(10,20);
		
	}

}
