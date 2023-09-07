package com.shaji.Day05;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_Operations4 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());

		ts.add(8);
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(7);

		System.out.println(ts);// TreeSet Print in Descending order...

	}

}
