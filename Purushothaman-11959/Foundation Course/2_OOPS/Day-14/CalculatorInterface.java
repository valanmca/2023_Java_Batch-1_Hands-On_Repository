package com.purushoth.day14;

//Interfaces
interface MyInterface {
	void addition(int a, int b);// abstract,public

	void subtraction(int a, int b);
}

class Calculator implements MyInterface {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}
}

public class CalculatorInterface {
    
	public static void main(String[] args) {
		MyInterface obj = new Calculator();
		obj.addition(21, 17);
		obj.subtraction(23, 18);
	}

}//Interface for Calculator.
