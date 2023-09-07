package com.jenish.day09;

//Types of Methods

public class Oops_2MethodCreation_Ex1 {
	void myMethod1() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");

	}

	public static void main(String[] args) {
		Oops_2MethodCreation_Ex1 obj = new Oops_2MethodCreation_Ex1();
		obj.myMethod1();
		
		Oops_2MethodCreation_Ex1.myMethod2();
	}

}
