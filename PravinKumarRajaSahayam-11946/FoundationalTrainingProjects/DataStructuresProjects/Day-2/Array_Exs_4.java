package com.pravinkumar.day2;

import java.util.ArrayList;

public class Array_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// [10,20,30,40,50]
		System.out.println("List: " + list);

		// Updates the number in list using the Index for help
		list.set(3, 25);
		System.out.println("List: " + list);

		// Accessed by the index for findings
		System.out.println(list.get(1));

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum + list.get(i);
		}

		System.out.println("sum:" + sum);
		// travelsal in the Index (Print one by one in the Memory of the Array)
		System.out.println("Array List Elements are:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
