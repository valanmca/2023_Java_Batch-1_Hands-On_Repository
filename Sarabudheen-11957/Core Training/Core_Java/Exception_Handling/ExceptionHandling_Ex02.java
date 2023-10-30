/*** Exception Handling with try and catch keyword ***/
package com.sara.CoreJava.Day_08;

public class ExceptionHandling_Ex02 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a = 10 / 0; // ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("After Exception");
	}

}
