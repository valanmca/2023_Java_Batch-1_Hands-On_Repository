package com.shiva.core.day08;

public class Except_02 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
		try {
			int a=10/0;
			System.out.println("A");//It will not print
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int arr[]= {10,2,3};
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
