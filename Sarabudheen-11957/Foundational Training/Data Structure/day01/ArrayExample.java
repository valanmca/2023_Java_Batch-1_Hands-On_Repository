/*****Updating an array elements and Display an array length...*****/
package com.sara.day01;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Third Element : " + arr[2]);
		arr[2] = 35;
		System.out.println("New Element : " + arr[2]);
		System.out.println("Length of The Array : " + arr.length);
		System.out.println("The Array Element Are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
