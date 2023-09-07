package com.aravind.day1;

public class ArrayExample1 {

	public static void main(String[] args) {
		// array declaration 1;
		int arr[] = { 10, 20, 30, 40, 50 };

		System.out.println("Third element in the array=" + arr[2]);
		arr[2] = 4;// uddating the 2 index of the array
		System.out.println("Third element after update in the array=" + arr[2]);
		System.out.println("Array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("array index" + i + "=" + arr[i]);
		}
	}

}
