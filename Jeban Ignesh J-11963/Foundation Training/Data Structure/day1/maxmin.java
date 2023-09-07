package com.jeban.day1;

import java.util.Scanner;

public class maxmin {
	public static void main(String[] args) {
		int arr[] = { 10, 30, 70, 50, 60 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
			System.out.println(arr[i]);

		}

		System.out.println("maxno:" + max);

		int min =arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("minno:" + min);

	}

}
