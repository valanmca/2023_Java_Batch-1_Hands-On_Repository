package com.dharshu.test;

import java.util.Scanner;

public class arraysearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		boolean bool = false;
		System.out.println("Enter the array element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array element:");
		for (int i = 0; i < arr.length; i++) {
			// arr[i]=sc.nextInt();
			System.out.println(" " + arr[i]);
		}
		System.out.println("Which element to be searched:");
		int search = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				bool = true;
				System.out.println(i);
				break;
			}

		}
		if (bool == false) {
			System.out.println(-1);
		}
	}

}
