package com.gayathri.day7;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = new int[] { 0, -5, 10, -10, 9, 1 };
		int temp;
		System.out.println("Ascending Bubble sort...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("  " + arr[i]);
		}

		System.out.println("\n\nDescending Bubble sort...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("  " + arr[i]);
		}
	}

}
