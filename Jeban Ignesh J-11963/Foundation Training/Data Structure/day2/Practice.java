package com.jeban.day2;

import java.util.LinkedList;
import java.util.*;

public class Practice {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("Size:" + list1.size());
		{
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			list1.add(5);
			list1.add(6);
			list1.add(7);
			list1.add(8);
			list1.add(9);
			list1.add(10);

		}

		System.out.println("L1:" + list1);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n Value:");
		int n = sc.nextInt();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {

			list2.add(list1.get(i) * n);

		}
		System.out.println("list2:" + list2);

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i) + "*" + n + "=" + list2.get(i));

		}

	}

}
