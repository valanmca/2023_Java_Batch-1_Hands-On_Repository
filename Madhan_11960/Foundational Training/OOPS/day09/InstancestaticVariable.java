package com.madhan.day09;

//Types of variables in java
public class InstancestaticVariable {
	  int a;  //Instance variable or object variable
	  int b;  //Instance variable or object variable
	  
	  static int c; //static variable or class variable
	  

	public static void main(String[] args) {
		 int e=10; //Local variable must be initialized with value
		System.out.println(e);
		
		InstancestaticVariable obj=new InstancestaticVariable();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		System.out.println(InstancestaticVariable.c);
		

	}

}
