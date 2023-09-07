/******** Inserting String Elements in TreeSet... ********/
package com.sara.day05;

import java.util.TreeSet;

public class TreeSet_Example2 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		// Inserting elements
		ts.add("Orange");
		ts.add("Banana");
		ts.add("Grapes");
		ts.add("Apple");
		ts.add("Guava");

		System.out.println(ts);// [Apple, Banana, Grapes, Guava, Orange]

	}

}
