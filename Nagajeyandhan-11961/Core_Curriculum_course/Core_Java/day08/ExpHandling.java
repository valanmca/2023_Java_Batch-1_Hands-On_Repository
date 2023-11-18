package com.jeyandhan.day08;

public class ExpHandling {

	public static void main(String[] args) {
		int a = Integer.parseInt("abc"); //NumberFormatEception
		
		int b = 10/0; // ArithmeticException
		
		int arr[] = new int[-5]; // NegativeArraySizeException
		
		int arr1[] = {1,2,3};
		System.out.println(arr1); //ArrayIndexOutOfBoundsException
		
		ExpHandling Exp = (ExpHandling) new Object(); // ClassCastException ... Here object is the super class
		

	}

}
