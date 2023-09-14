package com.jeyavel.day6;

import java.util.Scanner;

//linear search Algorithm using- Array 
public class LinearSearchinArray {

	public static void main(String[] args) {
		int arr[] = { 10, 8, 9, 6, 4, 5, 3, 2, 1, 19 };
		
		System.out.println("Enter the element to Search");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		@SuppressWarnings("unused")
		boolean isPresent = true;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				System.out.println("Element Present in the index of -> " + i);
				isPresent = true;
				break;

			}
		}
		if (isPresent = false) {
			System.out.println("Element is Not Present");

		}

	}

}
