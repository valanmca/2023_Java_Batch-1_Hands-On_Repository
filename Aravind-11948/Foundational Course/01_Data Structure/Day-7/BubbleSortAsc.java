package com.aravind.day7;

import java.util.Scanner;

public class BubbleSortAsc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++)// for no of steps
		{
			for (int j = 0; j < size - i - 1; j++)/// second loop is for comparing the index
			// size-i-1=each step last element must in sorted order
			{
				// System.out.println(arr[j]);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

	}

}
