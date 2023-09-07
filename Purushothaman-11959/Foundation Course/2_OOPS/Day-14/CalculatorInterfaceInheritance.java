package com.purushoth.day14;

interface Interface3{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface Interface4 extends Interface3{
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator2 implements Interface4{
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
public class CalculatorInterfaceInheritance {

	public static void main(String[] args) {
		//Interface1 obj=new Calculator1();
		//obj.addition(12, 16);
		//obj.subtraction(19, 17);
		
		Interface4 obj1=new Calculator2();
		obj1.addition(12, 16);
		obj1.subtraction(19, 17);
        obj1.multiplication(4, 12);
		obj1.division(20, 5);
		
		Calculator1 obj=new Calculator1();
		obj.addition(2, 6);
		obj.subtraction(9, 7);
		obj.multiplication(4, 2);
		obj.division(10, 5);

		
		
	}

}// Interface inheritance using extends keyword.
