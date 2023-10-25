package com.shiva.core.day06;

import java.util.Arrays;
import java.util.Scanner;

interface Sortable {
	void sort(int[] array);
}

class QuickSort implements Sortable {
	public void sort(int[] array) {
		Scanner sc = new Scanner(System.in);

		Arrays.sort(array);
		System.out.println("Merge sort = ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(" " + array[i]);
		}
	}
}

class MergeSort implements Sortable {
	public void sort(int[] array) {
		System.out.println();

		Arrays.sort(array);
		System.out.println("Merge sort = ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(" " + array[i]);
		}
	}
}

public class Assign_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuickSort obj = new QuickSort();
		System.out.println("QuickSort");
		System.out.println("Enter the size of Array");
		int value = sc.nextInt();
		int arr[] = new int[value];
		System.out.println("Enter " + value + " values");

		for (int i = 0; i < value; i++) {
			arr[i] = sc.nextInt();
		}
		obj.sort(arr);

		MergeSort obj2 = new MergeSort();
		System.out.println("MergeSort");
		System.out.println("Enter the size of Array");
		int value2 = sc.nextInt();
		int arr2[] = new int[value2];
		System.out.println("Enter " + value2 + " values");

		for (int i = 0; i < value2; i++) {
			arr2[i] = sc.nextInt();
		}
		obj.sort(arr2);

	}

}
