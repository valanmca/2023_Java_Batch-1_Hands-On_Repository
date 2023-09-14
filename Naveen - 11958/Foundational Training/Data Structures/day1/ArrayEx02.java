package com.naveen.day1;

import java.util.Scanner;


public class ArrayEx02 {

	public static void main(String[] args) {
		//char arr[] = new char[5]; /u000
		//float arr[] = new float[5]; 0.0f
		//String arr[] = new String[5]; /null
		//boolean arr[] = new boolean[5]; By default it prints false.
		int arr[] = new int[5];
		
		System.out.println("Initial Array Elements are :");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter "+ arr.length + "Values :");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("New Array Elements are :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
		
		
	}

}
