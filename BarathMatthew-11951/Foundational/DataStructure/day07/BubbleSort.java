package com.matthew.day07;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 23, 54, 1, 3, 6, 12, 7 };
		//Printing the array element before sorting.
		System.out.println("UnSorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
		//Logic
		int count = 0;
		while (count != -1) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
			if (count == 0) {
				count = -1;
				break;
			}
			count = 0;
		}
		//Printing the Sorted Array.
		System.out.println("\nSorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}
}
