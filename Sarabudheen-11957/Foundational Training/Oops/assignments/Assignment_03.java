package com.sara.assignments;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + arr.length + " Values : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
				}
		
		//Sum and Average of All Elements in an Array
		
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of The Array Elaments is : " + sum);
		
		int avg = sum/arr.length;
		System.out.println("Average of The Array Elaments is : " + avg);
		
		//Search Key Elements in an Array
		boolean result = false;
		System.out.println("Enter The Element to Search : ");
		int element = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				System.out.println("The Element present at "+i+" th index");
				result = true;
			
			}
		}

		if (result == false) {
			System.out.println("The Element not present");
		}
		
		//Count the Number of Occurrence of an Element in an Array
		System.out.println("Enter The Number : ");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] == number) {
				count ++;}}
			if(count ==0) {
				
				System.out.println("The Element not present...");
			}
			else {
				System.out.println("The Number of Digits in the "+number+ " is : " + count);
			}
			}

		
	
}
