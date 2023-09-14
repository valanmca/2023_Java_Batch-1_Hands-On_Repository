package com.domnic.day9;

public class InstanceAndStatic {
	int b; // it is a instance variable or Object variable

	static int c; // static or Class variable

	public static void main(String[] args) {
		int a =10; // local variable

		// we can call local variable by directly using the variable name
		System.out.println("local variable :"+a);

		// to call instance variable we need to create object and call it with object ref
		// variable
		InstanceAndStatic obj = new InstanceAndStatic();
		System.out.println("instance variable or Object variable :"+obj.b);

		// to call static variable or class variable there are 3 methods
		System.out.println("static variable :"+InstanceAndStatic.c); // by using class name and it is preferrable
		System.out.println("static variable :"+obj.c); // by using object ref variable
		System.out.println("static variable :"+c); // by directly using variable name

	}

}
