package com.gayathri.day8Exception;

//Exception handling class cast exception program
public class SampleClassCastException5 {

	public static void main(String[] args) {
		
		System.out.println("Class cast Exception");

		System.out.println("\nBefore Exception");
		
		//	Object o = new SampleClassCastException5();run normally

		//SampleClassCastException5 obj = new Object(); //compile time error
		
		SampleClassCastException5 obj = (SampleClassCastException5) new Object(); //exception
	
		System.out.println("After Exception");

	}

}
