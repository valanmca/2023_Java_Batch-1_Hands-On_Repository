package com.naveen.day14;

// Multiple Inheritance using interface..

interface One {
	int a = 10; // public static final
}

interface Two {
	int a = 20; // public static final
}

interface Three extends One, Two { // Multiple Inheritance
	void addition();
}

class Calculator3 implements Three {
	public void addition() {
		System.out.println("Addition : " + (One.a + Two.a));
	}
}

public class InterfaceEx04 {

	public static void main(String[] args) {
		Calculator3 obj = new Calculator3();
		obj.addition();
	}

}
