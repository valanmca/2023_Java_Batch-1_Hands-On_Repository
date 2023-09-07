/****** Adding,Removing and Updating String values in LinkedList... ******/
package com.sara.day02;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding an elements
		list.add("Abc");
		list.add("Def");
		list.add("Ghi");
		list.add("Jkl");
		System.out.println(list);// [Abc, Def, Ghi, Jkl]

		list.add(1, "Xyz");// Inserting Elements
		System.out.println(list);// [Abc, Xyz, Def, Ghi, Jkl]

		list.set(1, "Mno");// Updating an Element
		System.out.println(list);// [Abc, Mno, Def, Ghi, Jkl]

		list.remove(1);// Removing an element
		System.out.println(list);// [Abc, Def, Ghi, Jkl]

		System.out.println("The Size of LinkedList is : " + list.size());// 4

		System.out.println("The LinkedList Elements Are : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
