/***** Adding,Removing and Updating an element in an ArrayList... *****/
package com.sara.day02;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size : " + list.size()); // 0
		System.out.println(list);// []

		list.add(10);// Adding an elements at the end of the list
		System.out.println("Size of List : " + list.size());// 1

		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);// [10,20,30,40]
		System.out.println("Size of the list : " + list.size());// 4

		list.remove(2);
		System.out.println(list);// [10,20,40]
		System.out.println("Size of the list : " + list.size());// 3

		list.add(2, 25);
		System.out.println(list);
		System.out.println("Size of the list : " + list.size());
	}

}
