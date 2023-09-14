/***** Searching An Element in An Array... *****/
package com.sara.day01;

import java.util.Scanner;

public class Search1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		boolean result = false;
		System.out.println("Enter The Element : ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println("1");
				result = true;
				break;
			}
		}

		if (result == false) {
			System.out.println("-1");
		}
	}
}