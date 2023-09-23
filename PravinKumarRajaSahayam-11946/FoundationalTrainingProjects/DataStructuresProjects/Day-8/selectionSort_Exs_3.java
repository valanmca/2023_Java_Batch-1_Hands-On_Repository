//Selection Sort Algorithms for the ascending order using LinkedList
package com.pravinkumar.day8;

import java.util.Scanner;
import java.util.LinkedList;

public class selectionSort_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println("Enter the Size of the Array : ");

		Scanner sc = new Scanner(System.in);
		int arr = sc.nextInt();

		System.out.println("Enter the  Number of the Arrar : ");
		for (int i = 0; i < arr; i++) {
			int array = sc.nextInt();
			list.add(array);
		}

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			int midIndex = i;
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(midIndex) > list.get(j)) {
					midIndex = j;
				}
				int temp = list.get(i);
				list.set(i, list.get(midIndex));
				list.set(midIndex, temp);
			}
			System.out.println("After the Sorting Array are : " );
			for (int i1=0;i1<arr;i1++)
			{
				list.get(i1);
			}
			System.out.println(list);
		}
	}

}
