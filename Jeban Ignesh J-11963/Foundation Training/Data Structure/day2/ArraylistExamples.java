package com.jeban.day2;

import java.util.ArrayList;

public class ArraylistExamples {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size:" + list.size());// display list size
		System.out.println(list);

		list.add(10);// Adding value in list
		System.out.println("Size:" + list.size());
		System.out.println(list);

		list.add(20);
		list.add(34);
		list.add(40);

		System.out.println("Size:" + list.size());
		System.out.println(list);

		list.remove(1);// Remove from list
		System.out.println("Size:" + list.size());
		System.out.println(list);

		list.add(1, 89);// add another value in arraylist
		System.out.println("Size:" + list.size());
		System.out.println(list);

	}

}
