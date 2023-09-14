package com.swetha.day9;

      //Types of variables in java
public class Variables {
	int b=20;    //Instance or object variable,accessed by creating the object
	
	static int c=30;    //Static variable or class variable,run without object ,taking memory outside of object

	public static void main(String[] args) {
		int a=10;   //Local variable
		System.out.println("Local : "+a);    //Printing local variable by calling its variable name
		
		//Creating object to call the instance variable
		Variables obj=new Variables();
		System.out.println("Instance : "+obj.b);
		
		System.out.println("static : ");
		System.out.println(Variables.c);  //Printing the static variable by calling the class name
		System.out.println(obj.c);//optional
		System.out.println(c);//Optional

	}

}
