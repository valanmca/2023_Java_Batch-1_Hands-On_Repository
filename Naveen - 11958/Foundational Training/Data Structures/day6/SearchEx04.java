package com.naveen.day6;

//Binary Search Algorithm using Array.
import java.util.Scanner;

public class SearchEx04 {

	public static void main(String[] args) {
		int arr_size;
		System.out.println("Enter the Array Size :");
		Scanner sc = new Scanner(System.in);
		arr_size = sc.nextInt();

		int arr[] = new int[arr_size];

		System.out.println("Enter " + arr.length + " Values :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int s;
		int beg = 0;
		int end = arr.length - 1;
		System.out.println("Enter the element to search: ");
		s = sc.nextInt();
		boolean flag = false;

		while (beg <= end) {
			int mid = (beg + end) / 2;

			if (arr[mid] < s) {
				beg = mid + 1;
			} else if (arr[mid] > s) {
				end = mid - 1;
			} else if (arr[mid] == s) {
				System.out.println("Element present in the index : " + mid);
				flag = true;
				break;
			}
		}

		if (flag == false) {
			System.out.println("Not Found");
		}
		sc.close();
	}

}
