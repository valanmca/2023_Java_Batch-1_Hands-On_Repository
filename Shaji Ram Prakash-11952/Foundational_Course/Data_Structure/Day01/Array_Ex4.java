package com.shaji.Day01;

import java.util.Scanner;

public class Array_Ex4 {

	public static void main(String[] args) { //Initial to new Array Elements
		int arr[] = new int[5];
		
		System.out.println("Initial Array Elements Are : ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter " + arr.length + "Values");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("New Array Elements Are : ");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
