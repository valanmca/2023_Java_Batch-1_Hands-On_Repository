package com.mahesh.ds_day7;

import java.util.Scanner;

public class Bubble_Sort_Reverse {

	public static void main(String[] args) {
		// Sorting Reverse order (Bubble sort)
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the array size :");
		size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter your inputs : ");
		for (int index = 0; index < size; index++) {
			array[index] = sc.nextInt();
		}

		System.out.println("Array Elements :\n");
		for (int index = 0; index < size; index++) {
			System.out.print(array[index] + " ");

		}

		for (int index = 0; index < array.length; index++) {
			for (int Sindex = index; Sindex < array.length - 1; Sindex++) {
				if (array[Sindex] < array[Sindex + 1]) {
					int temp_var = array[Sindex];
					array[Sindex] = array[Sindex + 1];
					array[Sindex + 1] = temp_var;
				}
			}

		}
		System.out.println("\nAfter Sorting : \n");
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

	}

}
