package com.aravind.day9;

public class MethodTypes {
	void Method1()
	{
		System.out.println("It is Instance method have to create object");
	}

	static void Method2()
	{
		System.out.println("Static method doesnt require object ");
	}
	public static void main(String[] args) {
	MethodTypes obj1=new MethodTypes(); 
	
	obj1.Method1();//calling instance method using object
	
	MethodTypes.Method2();// calling static method in three ways
	Method2();
	obj1.Method2();// for static object doesn't require
	
	
		

	}

}
