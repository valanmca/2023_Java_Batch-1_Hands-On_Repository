package com.jeban.day2;

import java.util.Scanner;

public class array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];

		System.out.println("Enter Student id");
		int sId = sc.nextInt();

		System.out.println("Enter Student Name");
		String sName = sc.next();

		System.out.println("Enter Student Marks");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		int avg = sum / 3;
		System.out.println("Student Id:" + sId);
		System.out.println("Student Nmae:" + sName);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Mark" + arr[i]);
		}

		System.out.println("Total Marks:" + sum);
		System.out.println("Average Marks :" + avg);
	}

}
