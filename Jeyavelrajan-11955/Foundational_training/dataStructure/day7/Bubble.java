package com.jeyavel.day7;

public class Bubble {

	public static void main(String[] args) {
		int arr[] = { 89,12,34,87,45 };
		int temp;// Temporary variable to swap the values
		for (int i = 0; i < arr.length; i++) {// outer loop//use nested for loop to sorting
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) { //for descending order use less than(<) symbol 
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("The Output OF Bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);

	}

	}

}
