package com.aravind.day2;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("size:" + list.size());// 0
		System.out.println(list);// print the array list initially it is 0;

		list.add(10);// inserting element into the list in the end;
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println("size:" + list.size());
		System.out.println(list);

		list.remove(2);// remove the element in the index 2 in list;

		System.out.println("size:" + list.size());
		System.out.println(list);

		list.add(1, 77);// adding element in the middle of the list using index(index,value);

		System.out.println("size:" + list.size());
		System.out.println(list);

		list.remove(3);

		System.out.println("size:" + list.size());
		System.out.println(list);

	}

}
