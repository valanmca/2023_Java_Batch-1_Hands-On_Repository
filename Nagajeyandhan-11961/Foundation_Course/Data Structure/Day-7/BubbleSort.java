//Bubble sort

package com.jeyandhan.day07;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		int size, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size: ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The elements in the array are: ");
		for (int i = 0; i < size; i++) {
			System.out.println(+arr[i]);
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for (int i = 0; i < size; i++) {
			System.out.println(+arr[i]);
		}

	}

}
