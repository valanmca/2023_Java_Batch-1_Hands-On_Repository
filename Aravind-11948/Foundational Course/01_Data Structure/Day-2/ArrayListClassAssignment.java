package com.aravind.day2;

import java.util.*;

public class ArrayListClassAssignment {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		// 1). sum of index 2 and 3

		int sum = list.get(2) + list.get(3);

		// 3).//add the second index and third index;

		System.out.println("sum" + (list.get(2) + list.get(3)));
		System.out.println(sum);

		// System.out.println(sum);
		// 2).insert the sum value in index 0;

		list.add(0, sum);
		System.out.println(list);

		// 5).replace the last element of the list with 100;

		list.set(list.size() - 1, 100);
		System.out.println(list);

		// 7).remove the first element from the list;

		list.remove(1);
		System.out.println(list);

	}

}
