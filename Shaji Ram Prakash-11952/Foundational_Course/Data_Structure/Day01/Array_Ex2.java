package com.shaji.Day01;

public class Array_Ex2 { // Updating and Displaying with Array

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50 };
		
		System.out.println("Third Element : " + arr[2]); //Printing the Third Element
		
		arr[2] = 24; //Updating the Element
		
		System.out.println("New Element : " + arr[2]);
		
		System.out.println("Array Elements are : ");
		for(int i=0; i < arr.length; i++){
		System.out.println(arr[i]);
	}

	}

}
