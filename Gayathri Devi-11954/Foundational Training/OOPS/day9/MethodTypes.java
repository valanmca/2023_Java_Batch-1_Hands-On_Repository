package com.gayathri.day9;

public class MethodTypes {
	//in java, there only 2 types of method are available
	void methodType1()//instance method
	{
		System.out.println("Instance method");
	}
	static void methodType2()//static method
	{
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		
		MethodTypes obj = new MethodTypes();
		obj.methodType1();
		
		MethodTypes.methodType2();

	}

}
