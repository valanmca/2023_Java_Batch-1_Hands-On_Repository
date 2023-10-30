/**** Java program to create and implement the sorting interface ****/
package com.sara.CoreJava.Day_07;

import java.util.Arrays;

interface Sortable {
	void sort(int[] array);
}

class Quicksort implements Sortable {

	public void sort(int[] array) {
		Arrays.sort(array);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}
}

class Mergesort implements Sortable {
	public void sort(int[] array) {

		Arrays.sort(array);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			System.out.print(" ");
		}

	}
}

public class Assignment_04 {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 5, 2, 8, 6 };

		Quicksort quick = new Quicksort();
		quick.sort(array);

		System.out.println(" ");

		Mergesort merge = new Mergesort();
		merge.sort(array);
	}

}
