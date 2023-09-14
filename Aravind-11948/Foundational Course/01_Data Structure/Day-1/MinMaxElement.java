package com.aravind.day1;

import java.util.Scanner;

public class MinMaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter the array value");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		int max = arr[0];// assign the value of 0 index to max
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum element in the array=" + max);

		int min = arr[0];// assign the value of 0 index to min

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("minimum element in the array=" + min);

	}

}
