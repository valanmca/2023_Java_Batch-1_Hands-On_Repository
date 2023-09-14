package com.jeyavel.day6;

import java.util.Scanner;

public class BinarySearchinArray {

	public static void main(String[] args) {

		int arr[] = { 10, 12, 24, 29, 40, 51, 56, 69 };

		int beg = 0;
		int end = arr.length - 1;
		int mid = (beg + end) / 2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Search value");
		int input = sc.nextInt();

		boolean isPresent = false;
		while (beg <= end) {
			if (arr[mid] == input) {
				System.out.println("The Element is Present in The Index ->"+"No"+ mid);
				isPresent = true;
				break;
			}
			 if (arr[mid] < input) {
				beg = mid + 1;//to increase the beg +1
				mid = (beg + end) / 2;//traversing forward
			}
			else if (arr[mid] > input) {
				end = mid - 1;//to reduce the end value -1
				mid = (beg + end) / 2;//traversing Backward
			}
		}
		if (isPresent == false) {
			System.out.println("The Element is not Present ");
		}

	}

}
