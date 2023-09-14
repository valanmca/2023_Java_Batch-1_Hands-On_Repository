package com.jeban.day1;

import java.util.Scanner;

public class Arraysearch {
	public static void main(String[] args) {
		int arr[] = new int[5];
		int a, flag = -1;

		System.out.println("no1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter:" + arr.length + "values");// for get input the value from array
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the value:");
		a = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				flag = 1;

			}
		}
		if (flag == -1) {
			System.out.println(flag);
		}

	}

}
