package com.naveen.day1;

class Calculator{
	float n1;
	float n2;
	
	static float m1,m2;
	
	Calculator(float n1, float n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	void addition() {
		System.out.println("Addition is :" +(n1+n2));
	}
	
	void subtraction() {
		System.out.println("Subtraction is :" +(n1-n2));
	}
	
	static void multiply(float m1, float m2) {
		float mul = m1*m2;
		System.out.println("Multiplication is :" +mul );
	}
	static void division(float m1, float m2) {
		float div = m1/m2;
		System.out.println("Division is :" +div );
	}

}

public class Calculator_Test {

	public static void main(String[] args) {
		
		Calculator obj1 = new Calculator(15,10);
		obj1.addition();
		obj1.subtraction();
		
		Calculator.multiply(15,10);
		Calculator.division(15,10);
		
	}
}
