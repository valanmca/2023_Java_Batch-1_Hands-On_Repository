package com.purushoth.day_05;

interface CalculatorPlan {
	void addition(int a,int b);
	void subtraction(int a,int b);
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator1 implements CalculatorPlan {
	public void addition(int a,int b) {
		System.out.println("Add: "+(a+b));
	}
	public void subtraction(int a,int b) {
		System.out.println("Sub: "+(a-b));
	}
	public void multiplication(int a,int b) {
		System.out.println("Multiple: "+(a*b));
	}
	public void division(int a,int b) {
		System.out.println("Divide: "+(a/b));
	}
}

public class Interface3 {

	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		calc.addition(12, 18);

	}

}
