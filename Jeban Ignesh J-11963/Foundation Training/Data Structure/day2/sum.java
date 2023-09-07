package com.jeban.day2;

public class sum {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30 };
		int sum = 0;
		System.out.println("Sum:");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("sum:" + sum);

	}
}
