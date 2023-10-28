package com.dharshu.day7;

public class Ex_1_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		//int a = 10 / 0; 					//ArithmeticException
		
		//int arr[] = {10, 20, 30};
		//System.out.println(arr[4]); 		//ArrayIndexOutOfBoundsException
		
		//int a = Integer.parseInt("abc"); //NumberFormatException: For input string
		
		//int arr[] = new int[-5];			//NegativeArraySizeException
		
		//Object obj = new Ex_1_ExceptionHandling(); //DMD
		Ex_1_ExceptionHandling obj = (Ex_1_ExceptionHandling) new Object(); //ClassCastException and Casting
		System.out.println("After Exception");


	}

}
