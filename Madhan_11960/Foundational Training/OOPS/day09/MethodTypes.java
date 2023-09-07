package com.madhan.day09;

public class MethodTypes {
	
	void myMethod1()
	{
		System.out.println("Instance method required object to run");
	}
	static void myMethod2()
	{
		System.out.println("Static method does not required object");
	}

	public static void main(String[] args) {
		MethodTypes obj=new MethodTypes();
		obj.myMethod1(); // calling the instance method using object
		MethodTypes.myMethod2(); //static can be called by using class name 

	}

}
