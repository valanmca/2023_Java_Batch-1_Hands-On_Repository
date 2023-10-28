//Java Collections - List Example
package com.sara.CoreJava.Day_11;

import java.util.Iterator;
import java.util.LinkedList;

public class Collections_Example02 {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(2)); // 50
		list.remove(2);
		System.out.println(list);

		// way-1
		System.out.println("Way-1...");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println(" ");

		// way-2
		System.out.println("Way-2...");
		for (Integer o : list) {
			System.out.print(o);
			System.out.print(" ");
		}
		System.out.println(" ");

		// way-3
		System.out.println("Way-3...");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
	}

}
