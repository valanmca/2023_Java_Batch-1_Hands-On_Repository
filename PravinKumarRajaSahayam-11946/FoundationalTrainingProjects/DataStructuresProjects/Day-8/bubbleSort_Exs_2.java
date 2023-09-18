//Bubble Sort Algorithms for descending the elements
package com.pravinkumar.day8;

import java.util.Scanner;

public class bubbleSort_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		array = sc.nextInt();

		int arr[] = new int[array];

		System.out.println("Enter the Number : ");
		for (int i = 0; i < array; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Before Sorted the Array is:");
		for (int i = 0; i < array; i++) {
			System.out.println(arr[i] + " ");
		}

		int temp = 0;
		for (int i = 0; i < array; i++) {
			for (int j = 1; j < array - i; j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorted the Array is:");
		for (int i = 0; i < array; i++) {
			//For print in the array format then use this System.out.print(arr[i]);
			System.out.println(arr[i] + " ");
		}
	}

}
