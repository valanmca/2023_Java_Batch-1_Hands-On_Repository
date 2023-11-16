package com.mahesh.core_java_day_09;

public class Intro_Exception {

	public static void main(String[] args) {

		System.out.println("Before Exception");

		int a = 10 / 0;
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * com.mahesh.core_java_day_09.Intro_Exception.main(Intro_Exception.java:9)
		 */

		int arr[] = { 10, 20, 30, 40 };
		System.out.println(arr[5]);
		/*
		 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		 * out of bounds for length 4 at
		 * com.mahesh.core_java_day_09.Intro_Exception.main(Intro_Exception.java:13)
		 */

		int val = Integer.parseInt("abc");

		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string:
		 * "abc" at java.base/java.lang.NumberFormatException.forInputString(
		 * NumberFormatException.java:67) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:668) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:786) at
		 * com.mahesh.core_java_day_09.Intro_Exception.main(Intro_Exception.java:19)
		 */

		int array[] = new int[-15];

		/*
		 * Exception in thread "main" java.lang.NegativeArraySizeException: -15 at
		 * com.mahesh.core_java_day_09.Intro_Exception.main(Intro_Exception.java:28)
		 */

		Intro_Exception Obj = (Intro_Exception) new Object();

		/*
		 * Exception in thread "main" java.lang.ClassCastException: class
		 * java.lang.Object cannot be cast to class
		 * com.mahesh.core_java_day_09.Intro_Exception (java.lang.Object is in module
		 * java.base of loader 'bootstrap'; com.mahesh.core_java_day_09.Intro_Exception
		 * is in unnamed module of loader 'app') at
		 * com.mahesh.core_java_day_09.Intro_Exception.main(Intro_Exception.java:33)
		 */

		System.out.println("After Exception");

	}

}
