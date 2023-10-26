package com.jeban.Exception;

//****Types of Exceptions//****

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
//		int a=10/0;
//		int arr[]= {10,20,30};//array index out of bound exception
//		System.out.println(arr[4]);
//		int a=Integer.parseInt("abc");  //number format exception
////    int arr[]=new int[-5]; //negative array size exception 
//		Object o=new Exception1(); //DMD
		Exception1 o=(Exception1) new Object();		
		System.out.println("After Exception");

	}

}
