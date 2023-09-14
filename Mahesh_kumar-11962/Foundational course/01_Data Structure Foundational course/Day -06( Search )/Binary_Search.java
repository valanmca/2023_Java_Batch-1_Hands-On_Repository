package com.mahesh.ds_day6;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int search;
		int left = 0;
		int right = arr.length - 1;

		System.out.println("\nEnter your search element : ");
		search = sc.nextInt();
		
		while (left <= right) {

			int mid = (left + right) / 2;
			if (arr[mid] < search) {
				left = mid + 1;

			}

			else if (arr[mid] > search) {
				right = mid - 1;
			}

			else if (arr[mid] == search) {
				System.out.print("Value found");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.print("Not Found");
		}

	}
}
