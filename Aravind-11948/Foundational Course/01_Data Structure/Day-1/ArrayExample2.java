package com.aravind.day1;

import java.util.*;

public class ArrayExample2 {

	public static void main(String[] args) {

		int arr[] = new int[-5];
		System.out.println("initial value of array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the " + arr.length + "values=");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("After initialize the value of array=");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
