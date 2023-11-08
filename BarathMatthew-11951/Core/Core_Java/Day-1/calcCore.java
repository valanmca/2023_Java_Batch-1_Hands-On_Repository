package com.matthew.test;

class oper{
//	int a;
//	int b;
	
	void add(int a, int b) {
		System.out.println("Addition of two no : " +(a+b));
	}
	void sub(int a, int b) {
		System.out.println("Subtraction of two no : " +(a-b));
	}
	public static void mul(int a, int b) {
		System.out.println("Multiplication of two no : " +(a*b));
	}
	public static void div(int a, int b) {
		System.out.println("Division of two no : " +(a/b));
	}
}

public class calcCore {
	public static void main(String[] args) {
	oper oper1 = new oper();
	oper1.add(3,5);
	oper1.sub(20, 7);
	oper.mul(3, 5);	
	oper.div(50, 4);
	
	}
	 

}
