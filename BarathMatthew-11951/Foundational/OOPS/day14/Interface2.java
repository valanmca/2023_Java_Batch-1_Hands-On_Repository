package com.matthew.day14;
//implements will not call constructor just make a copy

interface MyInterface1{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface MyInterface2{
	void multiplication(int a,int b);
	void divition(int a,int b);
}

class Caculator4 implements MyInterface1,MyInterface2{
	public void addition(int a,int b) {
		System.out.println("Addition of two number : "+(a+b));
	}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction of two number : "+(a-b));
	}
	
	public void multiplication(int a,int b) {
		System.out.println("Multiplication of two number : "+(a*b));
	}
	
	public void divition(int a,int b) {
		System.out.println("Divition of two number : "+(a/b));
	}

}

public class Interface2 {

	public static void main(String[] args) {
		//we are creating object for calculator because we have to use both interface functionality
		
		Caculator4 obj = new Caculator4();
		obj.addition(10, 20);
		obj.subtraction(10, 20);
		obj.multiplication(10, 20);
		obj.divition(40, 20);
	}

}
