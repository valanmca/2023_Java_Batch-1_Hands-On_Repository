package com.dharshu.day9;

public class TypesOfMethods {
	void method()//instance method
	{
		System.out.println("Instance method");
	}
	
	static void method1() //static method
	{
		System.out.println("Static Method");
		
	}
// in java there is two types of method declaration in oops concept
	public static void main(String[] args) {
		TypesOfMethods obj=new TypesOfMethods();
		obj.method();
		
		TypesOfMethods.method1();		

	}

}
