//Selection Sort Algorithms for ascending using ArrayLists
package com.pravinkumar.day8;

import java.util.ArrayList;
import java.util.Scanner;

public class selectionSort_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter the size of the Array : ");
		int arr = sc.nextInt();

		int array;
		System.out.println("Enter the Number of the Array : ");
		for (int i = 0; i < arr; i++) {
			array = sc.nextInt();
			list.add(array);
		}

		System.out.println("Before the Sorted Array are : " + list);

		for (int i = 0; i < list.size(); i++) {
			int midIndex = i;
			for (int j = i; j < list.size(); j++) {
				if (list.get(midIndex) > list.get(j)) {
					midIndex = j;
				}
				int temp = list.get(i);
				list.set(i, list.get(midIndex));
				list.set(midIndex, temp);
			}
		}
		
		
		System.out.println("After the Sorted Array are : ");
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		System.out.println(list);

	}

}
