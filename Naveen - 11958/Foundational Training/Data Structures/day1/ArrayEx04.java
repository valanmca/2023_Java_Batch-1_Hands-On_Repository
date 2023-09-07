package com.naveen.day1;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		int arr_size;
		System.out.println("Enter the Array Size :");
		Scanner sc = new Scanner(System.in);
		arr_size = sc.nextInt();
		
		int arr[] = new int[arr_size];
		
		System.out.println("Enter " + arr.length + " Values :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
		System.out.println("Largest Number is " +max );
		
		
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Number is " +min );
		
		
		sc.close();
		
	}

}
