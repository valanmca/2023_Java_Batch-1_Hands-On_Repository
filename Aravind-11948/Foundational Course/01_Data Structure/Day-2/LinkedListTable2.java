package com.aravind.day2;

import java.util.*;

public class LinkedListTable2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);

		System.out.println("enter the n value");
		int n = sc.nextInt();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			list2.add(n * list.get(i));
		}
		System.out.println(list2);

		System.out.println("iterate two table");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "*" + n + "=" + list2.get(i));
		}

	}

}
