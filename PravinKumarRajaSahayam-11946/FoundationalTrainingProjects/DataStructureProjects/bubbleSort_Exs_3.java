//Bubble Sort Algorithms for ascending order in the LinkedList
package com.pravinkumar.day8;

import java.util.Scanner;
import java.util.LinkedList;

public class bubbleSort_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> array = new LinkedList<Integer>();
		LinkedList<Integer> arraylist = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array : ");
		int arr = sc.nextInt();

		int arrayq = 0;
		System.out.println("Enter the Numbers of the Array : ");
		for (int i = 0; i < arr; i++) {
			arrayq = sc.nextInt();
			array.add(arrayq);
		}

		System.out.println("Before the Sorted Array are : ");
			System.out.println(array);
		

		/*
		 * int temp = 0; for(int i=0;i<arr;i++) { for(int j=1;j<arr-i;j++) {
		 * if(array.get(j-1) > array.get(j) { temp = arr.get(j-1);
		 * array.set((j-1),array.get(j)); array.set(j,temp); } } }
		 */
		int temp = 0;
		for (int i = 0; i < arr; i++) {
			for (int j = i + 1; j < arr; j++) {
				if (array.get(i) > array.get(j)) {
					temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}
		System.out.println("After the Sorted Array are : ");
		for (int i = 0; i < arr; i++) {
			array.get(i);
		}
		System.out.println(array);
	}

}
