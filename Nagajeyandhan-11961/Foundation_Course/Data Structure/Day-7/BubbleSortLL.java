//Bubble sort with linked list

package com.jeyandhan.day07;

import java.util.LinkedList;

public class BubbleSortLL {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int temp;
		list.add(12);
		list.add(32);
		list.add(10);
		list.add(11);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j + 1, temp);
				}
			}
		}
		System.out.println("Sorted list: " + list);

	}

}
