package com.domnic.day9;

// types of methods()
public class Oops9 {
	void myMethod1() {
		System.out.println("Instance method");
	}

	static void myMethod2() {
		System.out.println("static method ");
	}

	public static void main(String[] args) {

		Oops9 m1 = new Oops9();       //calling instance method by creating object
		m1.myMethod1();
        System.out.println("---------------");
		Oops9.myMethod2();         //calling static method with the help of class name
	}

}
