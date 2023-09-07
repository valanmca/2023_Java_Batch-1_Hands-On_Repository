//Selection sort using array
package com.domnic.day7;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int temp = 0;
		int arr[] = new int[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for (int i = 0; i < arr.length; i++) {             //for(int i : arr){System.out.print(i)};
			System.out.println(arr[i]);
		}
	}

}
