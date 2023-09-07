package com.swetha.day1;

public class ArrayJava {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("Third Element :"+arr[2]);   //Printing the third element
		
		arr[2]=35; //Modifying the third element
		System.out.println("Third Element :"+arr[2]);
		
		System.out.println("Length of array :"+arr.length); //Length of the array
		
		System.out.println("Array elements are :");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
