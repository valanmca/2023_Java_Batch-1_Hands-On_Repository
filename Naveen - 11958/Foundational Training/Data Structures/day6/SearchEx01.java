package com.naveen.day6;

import java.util.Scanner;

//Linear Search Algorithm - Array
public class SearchEx01 {

	public static void main(String[] args) {
		int arr[] = { 10, 8, 5, 6, 2, 4, 20, 18 };

		System.out.println("Enter the element to Search : ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				System.out.println("Element present in the index :" + i);
				isPresent = true;
				break;
			}
		}

		if (isPresent == false)
			System.out.println("Element Not present");

		sc.close();
	}
}