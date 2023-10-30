/*** Exception Handling with Multiple catch statements ***/
package com.sara.CoreJava.Day_08;

public class ExceptionHandling_Ex03 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			int b = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("After Exception");
	}

}
