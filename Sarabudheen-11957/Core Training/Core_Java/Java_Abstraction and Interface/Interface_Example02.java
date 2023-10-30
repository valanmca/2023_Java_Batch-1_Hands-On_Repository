package com.sara.CoreJava.Day_07;

interface One {
	void addition(int a, int b);
}

interface Two {
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

public class Interface_Example02 {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.addition(5, 5);
		obj.subtraction(10, 5);
	}

}
