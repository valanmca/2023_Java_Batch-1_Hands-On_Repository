package com.domnic.oopsday7;

//Multiple Inheritance using interfaces
interface One {
	int a = 56; // by default its public static final
}

interface Two {
	int b = 27; // by default its public static final
}

interface Three extends One, Two { // Multiple inheritance
	void addition(); // by default its public abstract
	void substraction();
}

class Calculator3 implements Three {
	public void addition() {
		System.out.println("Addition : " + (One.a + Two.b));
	}
	public void substraction() {
		System.out.println("Substraction: " + (One.a - Two.b));
	}
}

public class MultipleInherit {

	public static void main(String[] args) {
		Calculator3 obj = new Calculator3();
		obj.addition();
		obj.substraction();
	}

}
