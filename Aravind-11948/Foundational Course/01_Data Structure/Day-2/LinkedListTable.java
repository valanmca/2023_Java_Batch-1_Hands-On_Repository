package com.aravind.day2;

import java.util.*;

public class LinkedListTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println("enter list 1 values");
		for (int i = 0; i < 10; i++) {
			int in = sc.nextInt();
			list.add(in);
		}

		/*
		 * list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
		 * list.add(7); list.add(8); list.add(9); list.add(10);
		 */
		System.out.println("enter the n value");
		int n = sc.nextInt();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		for (int i = 0; i < list.size(); i++) {

			list2.add(n * list.get(i));
		}

		System.out.println(list);

		System.out.println(list2);

	}

}
