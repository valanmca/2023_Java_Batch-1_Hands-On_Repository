/*****Bubble Sort Algorithm Using Array ...*****/
package com.sara.day07;

import java.util.Scanner;

public class BubbleSort_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp=0;
		System.out.println("Enter the Size of the Array : ");
		int arr_size = sc.nextInt();
		
		int arr[]= new int[arr_size];
		System.out.println("Enter the " +arr_size+ " elements of the Array : ");
		for (int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();}
		
		System.out.println("Initial Array Elements Are : ");
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);}

		for (int i =0; i<arr.length; i++) {
			for (int j =0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted Array Elements Are : ");
		for (int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);}

	}

}
