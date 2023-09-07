package com.shaji.Day07;

import java.util.Scanner;

public class BubbleSort_Descending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int temp;
		
		for(int i=0; i<arr.length; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size;i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Bubble Sorted Array : ");
		for(int i=0; i<size; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
