package com.gayathri.day8Exception;
//Exception handling Number format exception program
public class SampleNumberFormatException3 {

	public static void main(String[] args) {
		System.out.println("Number format Exception");
		System.out.println("\nBefore Exception");
		int a = Integer.parseInt("abc");
		System.out.println(a);
		System.out.println("After Exception");

	}

}
