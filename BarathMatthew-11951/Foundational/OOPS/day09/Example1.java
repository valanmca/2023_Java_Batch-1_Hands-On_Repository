//sum of instance and Static variable
package com.matthew.day09;

public class Example1 {
	// creating a instance variable
	int a = 10;
	
	//creating a static variable
	static int b= 20;
	public static void main(String[] args) {
		//creating an object for accessing the instance 'a':
		Example1 obj = new Example1();
		
		// storing instance variable in a temporary(local) variable
		int tempA = obj.a;
		
		//Storing the static variable in another temporary(local) variable
		int tempB = Example1.b;
		
		System.out.println("Sum of Instance and static variable : "+(tempA+tempB));

	}

}
