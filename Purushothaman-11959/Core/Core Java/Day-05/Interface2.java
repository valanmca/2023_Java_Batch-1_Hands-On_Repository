package com.purushoth.day_05;

interface One {
	void addition(int a,int b);
}

interface Two {
	void subtraction(int a, int b);
}

class Calculator implements One,Two {
	public void addition(int a,int b) {
		System.out.println("Addition: "+(a+b));
	}
	public void subtraction(int a,int b) {
		System.out.println("Subtraction: "+(a-b));
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addition(12, 32);
		calc.subtraction(45, 17);

	}

}
