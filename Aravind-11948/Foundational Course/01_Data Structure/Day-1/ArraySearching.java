package com.aravind.day1;

import java.util.*;

public class ArraySearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter the array value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter the value to be searched in the array");
		int n = sc.nextInt();

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == n) {
				temp = 1;
				System.out.println("array element present in the index=" + i);
				break;
			}

		}
		if (temp == 0) {
			System.out.println(-1);
		}

	}

}
