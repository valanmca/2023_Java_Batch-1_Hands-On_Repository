package com.dharshu.day6;

interface One{
	void addition(int a, int b);
}

interface Two extends One{
	void subtraction(int a,int b);
}

class Calculator implements Two{
	public void addition(int a,int b) {
		System.out.println("Addition:"+ (a+b));
	}
	
	public void subtraction(int a,int b) {
		System.out.println("Subtraction:"+ (a-b));
	}
}

public class N_Num_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		calc.addition(10,20);
		calc.subtraction(10,5);
	}

}
