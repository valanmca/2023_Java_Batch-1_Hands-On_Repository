package com.shiva.core.day08;

public class Except_01 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		
//		int a = 10 / 0; //ArithmeticException

//		int arr[] = { 10, 20, 30, 40 };
//		System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
		
//		int a=Integer.parseInt("abc"); //NumberFormatException
		
//		int arr[]=new int[-5]; //NegativeArraySizeException
		
//		Except_01 o=(Except_01) new Object(); //ClassCastException
		
		Object o=new Except_01(); //DMD
		
	
		System.out.println("After Exception");
	}

}
