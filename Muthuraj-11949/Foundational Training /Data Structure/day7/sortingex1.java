package com.muthu.day7;

import java.util.*;

public class sortingex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		{
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size - 1; j++) {
					if (arr[i] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("Sorted arry");
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
