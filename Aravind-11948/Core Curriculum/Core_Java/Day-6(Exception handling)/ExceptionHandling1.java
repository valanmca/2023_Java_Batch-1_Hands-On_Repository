package com.core.day_06_; 
// Exceptions

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		// int a=10/0; // ArithmeticException from Java.lang package

		// int arr[]= {10,20,30}; // ArrayIndexBoundException from Java.lang package
		// System.out.println(arr[4]);

		// int a =Integer.parseInt("abc"); // NumberFormatException from Java.lang
		// package

		//int arr[] = new int[-5]; // NegativeArraySizeException from Java.lang package
		
		//Object o=new ExceptionHandling1();  // object is superclass for all classes 
		
		ExceptionHandling1 O= (ExceptionHandling1)new Object(); // classCastException.

		System.out.println("After exception");
	}

}
