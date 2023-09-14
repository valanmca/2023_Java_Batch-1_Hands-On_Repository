//Addition of two numbers(Static and Instance variable)

package com.jeyandhan.day09;

public class Addition {
	//Variables
	
	int a =10; //instance variable
	static int b = 20; //static variable
	
	public static void main(String[] args) {
		
		Addition obj = new Addition(); //object creation
		System.out.println("Addition of a + b = "+((obj.a)+(Addition.b))); // 30
		
	}

}
