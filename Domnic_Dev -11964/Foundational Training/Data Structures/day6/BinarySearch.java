package com.domnic.day6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 3, 6, 7, 9, 12, 56, 70 };

		int start = 0;
		int end = arr.length - 1;

		// System.out.println("middle index is "+ middle);

		System.out.println("Enter the Value to be found :");
		int value = sc.nextInt();
		boolean temp = false;
		while (start != end) {
			int middle = (start + end) / 2;
			if (arr[middle] == value) {
				System.out.println(value + " is present in index " + middle);
				temp = true;
				break;
			}
			if (arr[middle] > value) {
				end = middle - 1;

			}
			if (arr[middle] < value) {
				start = middle + 1;

			}

		}
		if (temp == false) {
			System.out.println(value + " is not present in the array");
		}

	}

}
