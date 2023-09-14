package com.naveen.day2;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		// Adding the Elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list); // [10,20,30,40]

		list.add(1, 25); // Inserting Element using index value
		System.out.println(list); // [10,25,20,30,40]

		list.set(1, 100); // Update
		System.out.println(list); // [10,100,20,30,40]

		list.remove(1);
		System.out.println(list); // [10,20,30,40]

		System.out.println(list.size()); // 4

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
