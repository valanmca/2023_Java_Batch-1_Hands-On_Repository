/******* Types of Methods  - Instance and Static Method ... *******/
package com.sara.day09;

public class Methods_Types {

	void myMethod1() {
		System.out.println("Instance Method");
	}

	static void myMethod2() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Methods_Types obj = new Methods_Types();
		obj.myMethod1();

		Methods_Types.myMethod2();

	}

}
