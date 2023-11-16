package com.mahesh.core_java_day_09;

public class Arithmetic_Exception {

	public static void main(String[] args) {

		try {
			int a = 30 / 0;
			System.out.println(a);
			System.out.println("A : ");
		} catch (ArithmeticException e) {
			System.out.println(e);// java.lang.ArithmeticException: / by zero

			System.out.println("  -*-Thank you-*-  "); // -*-Thank you-*-
		}

	}

}
