package com.shaji.Day09;

//Types of Methods

public class Methods {
	
	void myMethod1() { //Instance Method Syntax
		System.out.println("Instance Method");
	}
	
	static void myMethod2() { //Static Method Syntax
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.myMethod1();
		
		Methods.myMethod2();

	}

}
