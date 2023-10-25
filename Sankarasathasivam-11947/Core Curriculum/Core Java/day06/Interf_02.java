package com.shiva.core.day06;

interface One {
	void addition(int a, int b);
}

interface Two extends One {
	void subtraction(int a, int b);
}

class Calculator implements One, Two {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}
}

public class Interf_02 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(10, 10);
		calc.subtraction(13, 3);

	}

}
