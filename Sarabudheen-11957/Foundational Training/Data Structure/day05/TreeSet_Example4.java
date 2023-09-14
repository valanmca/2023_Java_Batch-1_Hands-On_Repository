/*********** Inserting Integer and String elements in TreeSet... ************/
package com.sara.day05;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_Example4 {

	public static void main(String[] args) {

		TreeSet<Integer> ts1 = new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> ts2 = new TreeSet<String>(Collections.reverseOrder());

		// Inserting elements
		ts1.add(5);
		ts1.add(9);
		ts1.add(2);
		ts1.add(1);
		ts1.add(6);

		ts2.add("Orange");
		ts2.add("Banana");
		ts2.add("Grapes");
		ts2.add("Apple");
		ts2.add("Guava");

		System.out.println(ts1);// [9, 6, 5, 2, 1]
		System.out.println(ts2);// [Orange, Guava, Grapes, Banana, Apple]

	}

}
