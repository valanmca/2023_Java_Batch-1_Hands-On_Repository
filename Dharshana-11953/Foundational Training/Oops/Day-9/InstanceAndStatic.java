package com.dharshu.day9;

public class InstanceAndStatic {
	
	//default value is applicable for instance and static variable
	
	int b=20; //Instance or object variable
	
	static int c=30; //Static or Class variable

	public static void main(String[] args) {
		
		// Local variable
		
		int a=10; //for local variable there is no default value
		//local variable scope is within the block
		System.out.println("Local variable:"+a);//we can access the local variable with the variable itself
		
		InstanceAndStatic is=new InstanceAndStatic();
		System.out.println("Instance variable access by the object of the class:---"+is.b);//while creating the object of the class,by using the object we can access the instance variable
		
		//we can access the static variable in 3 ways
		
		//we can access the static variable with the help of classname and the particular variable itself
		System.out.println("Static variable access by the class name:---"+InstanceAndStatic.c);
		
		System.out.println("Static variable access by the object:---"+is.c);//we can access the static variable with the object 
		
		System.out.println("Static variable access by the variable itself:---"+c);//we can access the static variable with the variable itself
		

	}

}
