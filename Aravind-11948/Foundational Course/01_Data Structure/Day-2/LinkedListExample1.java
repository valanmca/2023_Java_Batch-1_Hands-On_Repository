package com.aravind.day2;

import java.util.*;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		// adding element at the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println("size=" + list.size());

		list.add(1, 25);// inserting element at particular index;
		System.out.println(list);

		System.out.println("size=" + list.size());

		list.set(1, 100);// update element in the index;
		System.out.println(list);

		System.out.println("size=" + list.size());

		list.remove(1);
		System.out.println(list);

		System.out.println("size=" + list.size());

		System.out.println("linked list elements=");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("element" + (i + 1) + ":" + list.get(i));
		}

		System.out.println("for each loop");// for each loop;
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("for each loop 2");// for each loop;
		for (int i : list) {
			System.out.println(i);
		}

	}

}
