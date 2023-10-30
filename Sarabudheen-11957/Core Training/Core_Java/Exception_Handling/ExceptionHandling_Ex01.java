/*** Types of Exceptions in java***/
package com.sara.CoreJava.Day_08;

public class ExceptionHandling_Ex01 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		int a = 10 / 0; // ArithmeticException
		int arr[] = { 10, 20, 30 };
		System.out.println(arr[4]); // ArrayIndexOutOfBoundsException

		// int a = Integer.parseInt("abc"); //NumberFormatException

		// int arr []= new int [-5]; //NegativeArraySizeException

		ExceptionHandling_Ex01 o = (ExceptionHandling_Ex01) new Object(); // ClassCastException
		System.out.println("After Exception");
	}

}
