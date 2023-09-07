package com.matthew.day02;
import java.util.LinkedList;
public class linkedList {

	public static void main(String[] args) {
		// Same code for array and linked list only difference is using linkedlist class instead of arraylist

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		list.add(0, 50);
		System.out.println("After seting value at First"+list);
		list.set(0,10);
		System.out.println("Updating first element"+list);
//		list.remove(0);
		System.out.println("Removing First element"+list.remove(0));
	}

}
