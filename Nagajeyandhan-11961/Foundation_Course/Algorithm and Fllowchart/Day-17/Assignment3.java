package com.jeyandhan.assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		int arr[] = { 3,5,6,3,7 };
		int temp = 0;
		int temp1 = 0, count = 0;
		int flag = 0;

		// 1st question
		System.out.println("The elements in the array are: ");
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			temp1 = temp / arr.length;
			System.out.println(arr[i]);
		}
		System.out.println("\n\t*****Sum*****");
		System.out.println("\nThe sum of values in the array: " + temp);
		System.out.println("\n\t*****Average*****");
		System.out.println("\nThe Average of values in the array:  " + temp1);
		
		Scanner sc = new Scanner(System.in);

		// 2nd question
		System.out.println("\n\t*****Searching*****");
		System.out.println("\nEnter the value to search");
		int search = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("Element is there");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("Element is not there");
		}

		// 3rd question
		System.out.println("\n\t*****Number of occurence*****");
		System.out.println("\nEnter the element to found its occurence: ");
		int element = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (element == arr[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(element + " is not present in the array");
		} else {
			System.out.println(element + " present " + count + " times");
		}
	}

}
