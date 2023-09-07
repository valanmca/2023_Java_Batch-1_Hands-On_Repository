package com.jeban.day6;

import java.util.Scanner;

public class Binary1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 56, 67, 78, 80 };
		int left = 0;
		int right = arr.length-1;
		int mid = (left + right) / 2;

//		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value:" );
		int j = sc.nextInt();

//		int j = 1;

		boolean isPresent = false;
		while (left<= right) {
			if (arr[mid] == j) {
				System.out.println("Element present in the Index: " + mid);
				isPresent = true;
				break;

			}
			if (arr[mid] < j) {
				left = mid + 1;
				mid = (left + right) / 2;
			}
			if (arr[mid] > j) {
				right = mid - 1;
				mid = (left + right) / 2;
			}

		}
		if (isPresent == false) {
			System.out.println("Element not Present");
		}

	}

}
