package com.matthew.day01;

public class ArrayExample {
		//First way of array declaration
	public static void main(String[] args) {
		// in java array is an object so the memory will get allocated only on run time
		int arr[] = {10,20,30,40,50};
		// Displaying elements from the array
		System.out.println("Displaying 3rd element : "+arr[2]);
		// Updating the element in the array
		arr[2] =33;
		System.out.println("Displaying the 3rd element from array after updating: " +arr[2]);
		
		//Displaying all the elements in the array using for loop
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
