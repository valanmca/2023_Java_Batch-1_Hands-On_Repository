/***** Adding,Replacing and Traversing an elements in ArrayList... *****/
package com.sara.day02;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);// [10,20,30,40]

		list.set(1, 70);// set is for updating the elements
		System.out.println(list);// [10,70,30,40]

		System.out.println(list.get(3));// 40

		System.out.println("The ArrayList Elements are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
