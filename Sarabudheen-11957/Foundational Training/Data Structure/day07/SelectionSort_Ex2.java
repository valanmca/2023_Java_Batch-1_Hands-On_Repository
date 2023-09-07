/***** Selection Sort Algorithm Using LinkedList ...*****/
package com.sara.day07;

import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSort_Ex2 {

	public static void main(String[] args) {
		LinkedList<Integer> Initial_list = new LinkedList<Integer>();
		LinkedList<Integer> Sorted_list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The List Size : ");
		int size = sc.nextInt();

		System.out.println("Enter the " + size + " elements of the List : ");
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			Initial_list.add(element);
		}
		System.out.println("The Initial List Elements : " + Initial_list);

		for (int i = 0; i < size; i++) {
			int minIndex = i;
			for (int j = i + 1; j < size; j++) {
				if (Initial_list.get(minIndex) > Initial_list.get(j)) {
					minIndex = j;
				}
			}
			int temp = Initial_list.get(i);
			Initial_list.set(i, Initial_list.get(minIndex));
			Initial_list.set(minIndex, temp);

		}
		for (int i = 0; i < size; i++) {
			Sorted_list.add(Initial_list.get(i));
		}
		System.out.println("Sorted List Elements Are : " + Sorted_list);

	}

}
