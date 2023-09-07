/***** Selection Sort Algorithm Using Array ...*****/
package com.sara.day07;

import java.util.Scanner;

public class SelectionSort_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		int arr_size = sc.nextInt();

		int arr[] = new int[arr_size];
		System.out.println("Enter the " + arr_size + " elements of the Array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Initial Array Elements Are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("Sorted Array Elements Are : ");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
