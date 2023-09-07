package com.naveen.day2;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list); // [10,20,30,40]

		list.set(1, 25); // Updates of ArrayList
		System.out.println(list); // [10,25,30,40]

		System.out.println(list.get(1)); // 25 Accessed by index

		System.out.println("Array List Elements are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}

}
