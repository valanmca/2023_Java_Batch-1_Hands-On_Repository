package com.shaji.Day01;

public class Array_Ex3 { // Initial Array Elements of int, float and char

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		System.out.println("Initial Array Elements Are : ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		float arr1[] = new float[5];
		
		System.out.println("Initial Array Elements Are : ");
		for(float j=(float)0.0; j < arr.length; j++) {
			System.out.println(arr1[(int)j]);
		}
		
		char arr2[] = new char[5];
		
		System.out.println("Initial Array Elements Are : ");
		for(char k=0; k < arr.length; k++) {
			System.out.println(arr2[k]);
	}
	}

}
