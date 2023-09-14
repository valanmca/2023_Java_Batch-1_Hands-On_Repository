/******** Ignoring Duplicate values in TreeSet... ********/
package com.sara.day05;

import java.util.TreeSet;

public class TreeSet_Example3 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// Inserting elements
		ts.add(5);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		ts.add(6);
		ts.add(6);// Ignoring Duplicate values
		ts.add(1);
		ts.remove(6);
		
		System.out.println(ts);// [1, 2, 5, 9]
		System.out.println(ts.size());

	}

}
