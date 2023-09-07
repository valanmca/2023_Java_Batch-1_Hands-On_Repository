//Searching the Element in the Array using Linear Search Algorithm Program uses 
package com.pravinkiumar.day6;

import java.util.Scanner;

//Linear Search Algorithm - Array
public class LinearSearchAlgorithm_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 8, 5, 6, 2, 4, 20, 18 };

		System.out.println("Enter the Element to Search:");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		// Using Boolean Method to Verify True or False used
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				System.out.println("Element present in the Index: " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element Not Present:");
		}
	}

}
