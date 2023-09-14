package com.matthew.day07;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 23, 54, 1, 3, 6, 12, 7 };
		
		for(int i = 0; i<arr.length;i++) {
			int min = i;
			int num = i;
			int val = num;
			for (int j = i;j<arr.length;j++) {
				num = j;
				if (arr[min] >arr[num]) {
					min = num;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		// Printing the Sorted Array.
		System.out.println("\nSorted Array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}
}
