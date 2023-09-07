//Bubble Sort Algorithms for ascending the elements
package com.pravinkumar.day8;

public class bubbleSort_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 3, 2, 4, 1, 6, 7, 9, 8, 10 };
		{
		System.out.println("Before The Array are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr.length - i; j++) {
					if (arr[j-1] > arr[j]) {
						temp = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
			System.out.println();
			System.out.println("After The Arrat are:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			}
		}
	}


