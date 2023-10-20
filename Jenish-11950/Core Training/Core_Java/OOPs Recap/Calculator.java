package com.jenish.OopsRecap;
	
public class Calculator {
	static int num1;
	static int num2;
	
Calculator(int num1, int num2){
	this.num1 = num1;
	this.num2 = num2;
}
void Add() {
	System.out.println("Sum of two number:" +(num1+num2));
	}

void Sub() {
		System.out.println("Sub of two numbers:" +(num1-num2));
	}
static void Mul() {
	System.out.println("Mul of two number:" +(num1*num2));
}
static void Div() {
	System.out.println("Div of two numbers:" +(num1/num2));
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator (24,2);//object creation
		calc.Add();
		calc.Sub();
		
		//method calling
		calc.Mul();
		calc.Div();
	}

	}
