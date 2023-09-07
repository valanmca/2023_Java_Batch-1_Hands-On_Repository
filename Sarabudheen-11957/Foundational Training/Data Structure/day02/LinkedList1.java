/****** Adding,Removing and Updating an Integer values in LinkedList... ******/
package com.sara.day02;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		// Adding an elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);// [10,20,30,40,]

		list.add(1, 24);// Inserting Elements
		System.out.println(list);// [10,24,20,30,40,]

		list.set(1, 100);// Updating an Element
		System.out.println(list);// [10,100,20,30,40,]

		list.remove(1);// Removing an element
		System.out.println(list);// [10, 20, 30, 40]

		System.out.println("The Size of LinkedList is : " + list.size());// 4

		System.out.println("The LinkedList Elements Are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
