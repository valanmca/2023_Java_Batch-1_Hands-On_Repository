package com.dharshu.day14;

@FunctionalInterface
interface MyInterface{
	int calc(int a,int b);
}

//Normal Interface 

//class NormalClass implements MyInterface{ //Addition
//	public int calc(int a,int b) {
//		return a+b;
//	}
//}
//
//class NormalClass1 implements MyInterface{ //Subtraction
//	public int calc(int a,int b) {
//		return a-b;
//	}
//}

//Using Lambda function we can reduce the code.
public class Lambda_Example {

	public static void main(String[] args) {
		MyInterface sum = (a,b) -> a+b;
		MyInterface sub = (a,b) -> a-b;
		System.out.println("Addition:"+sum.calc(10, 20));
		System.out.println("Subtraction:"+sub.calc(20, 10));
		
	}

}
