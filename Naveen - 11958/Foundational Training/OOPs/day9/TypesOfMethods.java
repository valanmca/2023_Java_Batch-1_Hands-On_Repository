package com.naveen.day9;
//Types of Methods

public class TypesOfMethods {

	void myMethod1() {
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		
		TypesOfMethods obj = new TypesOfMethods();
		obj.myMethod1();
		
		TypesOfMethods.myMethod2();
	}

}
