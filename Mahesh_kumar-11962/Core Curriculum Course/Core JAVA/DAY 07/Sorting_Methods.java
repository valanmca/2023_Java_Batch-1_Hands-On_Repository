package com.mahesh.core_java_day_07;

import java.util.Arrays;
import java.util.Stack;

interface Sortable {

	Stack<Integer> st = new Stack<Integer>();

	void sort(int[] arr, int[] array);

}

class QuickSort implements Sortable {
	public void sort(int[] arr, int[] array) {
		System.out.println("Unsorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("\nSORTED ARRAY : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			st.push(arr[i]);
		}
		System.out.println("\nReverse Order :");
		for (int i = 0; i < array.length; i++) {
			array[i] = st.pop();
			System.out.print(" "+array[i]);
		}

	}

}

class MergeSort implements Sortable {

	public void sort(int[] arr, int[] array) {

		System.out.println("Unsorted Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("\nSORTED ARRAY : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
			st.push(arr[i]);
		}
		System.out.println("\nReverse Order :");
		for (int i = 0; i < array.length; i++) {
			array[i] = st.pop();
			System.out.print(" "+array[i]);
		}

	}
}

public class Sorting_Methods {

	public static void main(String[] args) {

		Sortable quick = new QuickSort();
		int[] arr = { 2, 6, 4, 7, 9, 0, 11, 43, 22 };
		int[] array = new int[arr.length];
		System.out.println("\n Quick Sort\n ---------\n");
		quick.sort(arr, array);
		System.out.println("\n Merge Sort\n ----------\n");
		Sortable merge = new MergeSort();
		merge.sort(arr, array);
		
	}
	

}
