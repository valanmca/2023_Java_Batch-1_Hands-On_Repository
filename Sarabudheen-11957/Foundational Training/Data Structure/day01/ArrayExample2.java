/******Getting Array Elements From User...******/
package com.sara.day01;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {

		int arr[] = new int[5];
		System.out.println("Initial Array Elements Are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter " + arr.length + " Values : ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("New Array Elements Are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
