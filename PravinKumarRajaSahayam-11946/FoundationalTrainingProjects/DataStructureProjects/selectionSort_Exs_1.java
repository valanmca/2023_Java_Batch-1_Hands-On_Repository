//Selection Sort Algorithms for ascending the list using the arrays
package com.pravinkumar.day8;

import java.util.Scanner;

public class selectionSort_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 5, 1, 3, 2, 4 };

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = 0; j < arr.length; i++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
//New method for the For Loops
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
