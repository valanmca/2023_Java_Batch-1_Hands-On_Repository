/***********Minimum and Maximum Values in an Array...************/
package com.sara.day01;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = { 20, 36, 31, 12, 75, 43 };
		int max = 0;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				System.out.println(max);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				System.out.println(min);
			}

		}

	}

}
