package com.sara.CoreJava.Day_07;

interface One1 {
	int a = 10; // public static final
}

interface Two1 {
	int b = 20; // public static final
}

interface Three extends One1, Two1 {
	void sum();
}

class Calculator1 implements Three {
	public void sum() {
		// System.out.println(a + b);
		System.out.println(a + b);
	}
}

public class Interface_Example03 {

	public static void main(String[] args) {

		Calculator1 calc = new Calculator1();
		calc.sum();
	}

}
