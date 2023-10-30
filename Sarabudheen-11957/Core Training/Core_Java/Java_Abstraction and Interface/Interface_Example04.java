package com.sara.CoreJava.Day_07;

interface One2 {
	int a = 10; // public static final
}

interface Two2 {
	int a = 20; // public static final
}

interface Three1 extends One1, Two1 {
	void sum();
}

class Calculator2 implements Three {
	public void sum() {
		System.out.println(a + b);
		System.out.println(One2.a + Two2.a);
	}
}

public class Interface_Example04 {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		calc.sum();

	}

}
