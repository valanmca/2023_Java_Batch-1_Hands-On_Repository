package com.gayathri.day1;

public class JavaArray {

	public static void main(String[] args) {

		int arr[] = { 12, 23, 34, 45, 56 };// 1st way of array declaration
		// array index always start with 0

		System.out.println("Third Element : " + arr[2]); // print the element

		arr[2] = 100; // update / change the element

		System.out.println("New Third Element : " + arr[2]);

		System.out.println("Array Traversing.....");
		for (int i = 0; i < arr.length; i++) // length runtime counting the length
		{
			System.out.println(+i + "=" + arr[i]);
		}
	}

}
