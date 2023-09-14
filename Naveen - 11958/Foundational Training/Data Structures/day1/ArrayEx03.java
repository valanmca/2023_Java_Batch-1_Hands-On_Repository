package com.naveen.day1;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		int arr[] = new int[5];

		System.out.println("Enter " + arr.length + " Values :");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter Element to be searched :");
		int n = sc.nextInt();
		
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				System.out.println("The Index of the number " +n+" is :" + i);
				flag = true;
			}

		}
		
		
		if(flag == false) {
			System.out.println("-1");
		}
		
		sc.close();

	}
}
