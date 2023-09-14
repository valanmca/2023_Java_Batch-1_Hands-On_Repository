package com.gayathri.day1;

import java.util.Scanner;

public class JavaNewArray {

	public static void main(String[] args) {

		int arr[] = new int[5]; // new keyword run time size/memory allocation
		// array declaration
int temp=0;
		System.out.println("Initial array elements.....");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter " + arr.length + " elements : ");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("New array elements.....");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Ascending order array elements.....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					 temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("  " + arr[i]);
		}
System.out.println("\n"+temp);
		System.out.println("\n Descending order array elements.....");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print("  " + arr[i]);

		}System.out.println("\n"+temp);

	}

}
