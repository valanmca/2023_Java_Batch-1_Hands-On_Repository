package com.naveen.day6;

// Exception scenarios
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		// int a = 10 / 0; ----> Arithmetic Exception
		// int arr[] = {10, 20, 30 }; ----------> ArrayIndexOutOfBoundsException
		// System.out.println(arr[4]);
		// int a = Integer.parseInt("abc"); ------->NumberFormatException
		// int arr[] = new int[-5]; --------> NegativeArraySizeException
		Object obj = new Ex01(); // DMD
		// Ex01 o = (Ex01) new Object(); --------> ClassCastException (it is a type
		// casting in java).

		System.out.println("After Exception");

	}

}
