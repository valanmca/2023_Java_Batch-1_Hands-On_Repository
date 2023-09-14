//bubblesort in Linkedlist
package com.domnic.day7;

import java.util.Scanner;
import java.util.LinkedList;

public class BubbleSort3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		System.out.println("Enter the size of the list :");
		int size = sc.nextInt();
		System.out.println("Enter the " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		int temp = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
                    list.set(j, temp);
				}
			}
			
		}
		for(int i=0;i<size;i++) {
			list2.add(list.get(i));
		}
		System.out.println("Sorted array :");
		System.out.println(list2);
	}

}
