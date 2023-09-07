package com.shaji.Day14;

//Multiple Inheritance using Interfaces
interface One {
	int a = 10;
}

interface Two {
	int a = 20;
}

interface Three extends One, Two { // Multiple Inheritance
	void addition(); // public abstract
}

class Calculator3 implements Three {
	public void addition() {
		System.out.println("Addition : " + (One.a + Two.a));
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		Calculator3 obj = new Calculator3();
		obj.addition();

	}

}
