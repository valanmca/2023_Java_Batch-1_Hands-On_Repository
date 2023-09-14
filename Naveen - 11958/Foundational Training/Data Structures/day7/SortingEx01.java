package com.naveen.day7;

import java.util.Scanner;

//Bubble Sort using array.
public class SortingEx01 {

	public static void main(String[] args) {
		int arr_size;
		System.out.println("Enter the Array Size :");
		Scanner sc = new Scanner(System.in);
		arr_size = sc.nextInt();

		int arr[] = new int[arr_size];

		System.out.println("Enter " + arr.length + " Values :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Sorted Array are: ");
		int temp;
		for (int i = 0; i < arr_size; i++) {
			for (int j = 0; j < arr_size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			} System.out.println(arr[i]); 

		}

		sc.close();
	}

}
