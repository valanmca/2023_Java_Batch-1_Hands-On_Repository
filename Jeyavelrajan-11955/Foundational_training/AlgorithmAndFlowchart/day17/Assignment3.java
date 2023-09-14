
package com.jeyavel.Assignment;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
// 1st question
		System.out.println("Java Program to Find Sum and Average of All Elements in an Array\n");
		int arr[] = new int[5];

		System.out.println("Enter " + arr.length + " Values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int temp1 = 0;
		int temp2 = 0;
		for (int i = 0; i < arr.length; i++) {
			temp1 = temp1 + arr[i];
			temp2 = temp1 / arr.length;
		}
		System.out.println("Sum of array :" + temp1);
		System.out.println("Average of array :" + temp2);

// 2nd question

		System.out.println("Java Program to Search Key Elements in an Array\n");
		System.out.println("Enter the value to be found :");
		int user_input1 = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {

			if (user_input1 == arr[i]) {
				System.out.println(user_input1 + " is present in the index :" + i);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("Entered element is not present :");
		}

		// 3rd question
		System.out.println("Java Program to Count the Number of Occurrence of an Element in an Array\n");
		System.out.println("Enter the element to found its occurrence :");
		int user_input2 = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (user_input2 == arr[i]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println(user_input2 + " is not present in the array ");
		} else {
			System.out.println(user_input2 + " present " + count + " times ");
		}
	}
}
