package com.naveen.day5;

interface One {
	void addition(int a, int b);
}

interface Two {
	void subtraction(int a, int b);
}

class Calculator implements Two {
	public void addition(int a, int b) {
		System.out.println("Addition:" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}
}

public class Ex_3_Interface_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.addition(20, 30);
		calc.subtraction(20, 30);
	}

}
