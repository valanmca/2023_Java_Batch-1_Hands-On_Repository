package com.jeban.day2;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size:" + list.size());
		list.add(10);
		list.add(45);
		list.add(67);
		list.add(78);
		System.out.println(list);

		list.set(2, 39);

		System.out.println(list);
		System.out.println("Size:" + list.size());
		System.out.println(list.get(2));

		System.out.println("Enter the Arraylist:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// TODO Auto-generated method stub

	}

}
