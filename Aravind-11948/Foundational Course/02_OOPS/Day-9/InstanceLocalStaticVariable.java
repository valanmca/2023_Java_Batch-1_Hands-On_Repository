package com.aravind.day9;
//types of variables in java 

public class InstanceLocalStaticVariable {
	int b ;// instance variable or object variable 
	//separate copy for every object 
	// we have to create a object and access the value

	static int c;// static or class variable  single copy 
	// obj doestn't required
	// call by class name.c
	// by only variable

	public static void main(String[] args) {

		int a = 10;// local variable
		// access with in the block;
		System.out.println("local variable access with in block  " + a);

		// instance variable obj creation
		InstanceLocalStaticVariable obj = new InstanceLocalStaticVariable();

		System.out.println("Instance variable must create object for class " + obj.b);

		// InstanceLocalStaticVariable==class name
		// three ways to call static variable
		System.out.println("static variable three types of calling below refer code");
		System.out.println(InstanceLocalStaticVariable.c);
		System.out.println(obj.c);
		System.out.println(c);
	}

}
