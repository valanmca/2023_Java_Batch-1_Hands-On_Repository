package com.naveen.day7;

import java.util.Scanner;

//Selection sort using array.
public class SortingEx04 {

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

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}

		for (int i : arr) { //Another way of traversing the array.
			System.out.println(i);
		}

		sc.close();

	}

}
