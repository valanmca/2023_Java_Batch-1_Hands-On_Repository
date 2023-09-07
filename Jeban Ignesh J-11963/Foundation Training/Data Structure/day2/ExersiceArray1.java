package com.jeban.day2;

import java.util.ArrayList;

public class ExersiceArray1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size:" + list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("List:" + list);// 1

		int sum = 0;// 2
		sum = list.get(2) + list.get(3);
		System.out.println(sum);

		list.add(0, sum);// 3
		System.out.println(list);// 4

		list.set(list.size() - 1, 100);
		System.out.println(list);// 5

		list.remove(0);
		System.out.println(list);

	}

}
