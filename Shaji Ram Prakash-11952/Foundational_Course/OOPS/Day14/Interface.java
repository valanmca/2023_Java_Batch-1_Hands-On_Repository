package com.shaji.Day14;

//Interfaces
interface myInterface {
	void addition(int a, int b);// abstract,public

	void subtraction(int a, int b);
}

class Calculator implements myInterface {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}
}

public class Interface {

	public static void main(String[] args) {
		myInterface obj = new Calculator();
		obj.addition(14, 24);
		obj.subtraction(24, 14);

	}

}
