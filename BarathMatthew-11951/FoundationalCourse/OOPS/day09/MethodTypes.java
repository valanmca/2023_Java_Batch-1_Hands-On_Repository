package com.matthew.day09;

public class MethodTypes {
	//Creating an instance method
	void myMethod() {
		System.out.println("This is a instance method .");
	}

	//Creating a Static method
	
	static void myStaticMethod() {
		System.out.println("This is a static method.");
	}
	public static void main(String[] args) {
		
		//creating object for accessing instance myMethod
		
		MethodTypes obj = new MethodTypes();
		obj.myMethod();
		
		System.out.println("--------------------------------------");
		//Printing static method
		
		MethodTypes.myStaticMethod();

	}

}
