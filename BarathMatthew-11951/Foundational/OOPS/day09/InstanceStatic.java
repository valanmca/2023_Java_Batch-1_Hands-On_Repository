package com.matthew.day09;
//default value is applicable for instance and static variable
// 0,0.0,false,null - default values
public class InstanceStatic {
	int a; // Instance or Object variable 
	//in this a the default value will be assign to 0
	
	static int c = 10; //Static or class variable
	
	public static void main(String[] args) {
		
		// for local variable there is no initial value
		int b= 30; // local variable
		System.out.println(b);
		
		// To Access a we have to create an object
		InstanceStatic obj = new InstanceStatic(); 
		
		//after creating an object we can access the instance value like method using '.'
		System.out.println(obj.a);
		
		//we can access static or class variable without creating an object
		
		//Method -1 - This is the right way
		
		System.out.println("Method -1"+InstanceStatic.c);
		
		//Method - 2
		//we can also use object but its not needed
		
		System.out.println("Method -2"+obj.c);
		
		// Method -3
		//Since c is inside the same file we call call it like normal variable
		
		System.out.println("Method -3 "+c);
		
	}

}
