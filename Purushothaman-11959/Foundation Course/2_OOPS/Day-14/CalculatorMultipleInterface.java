package com.purushoth.day14;

interface Interface1{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface Interface2{
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator1 implements Interface1,Interface2{
	public void addition(int a,int b) {
		System.out.println("Addition: "+(a+b));
	}
	public void subtraction(int a,int b) {
		System.out.println("Substraction: "+(a-b));
	}
	public void multiplication(int a,int b) {
		System.out.println("Multiplication: "+(a*b));
	}
	public void division(int a,int b) {
		System.out.println("Division: "+(a/b));
	}
}
public class CalculatorMultipleInterface {

	public static void main(String[] args) {
		//Interface1 obj=new Calculator1();
		//obj.addition(12, 16);
		//obj.subtraction(19, 17);
		
		//Interface2 obj1=new Calculator1();
		//obj1.multiplication(4, 12);
		//obj1.division(20, 5);
		
		Calculator1 obj=new Calculator1();
		obj.addition(12, 16);
		obj.subtraction(19, 17);
		obj.multiplication(4, 12);
		obj.division(20, 5);

		
		
	}

}// Multiple interface is used.
