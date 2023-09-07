package com.naveen.day5;

import java.util.Collections;
import java.util.TreeSet;

public class TreeEx04 {

	public static void main(String[] args) {
		// Tree set to display the values in descending order.
		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> ts1 = new TreeSet<String>(Collections.reverseOrder());

		ts.add(8);
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(7);
		System.out.println(ts); // It will display the Integers in Descending Order.

		ts1.add("Arasu");
		ts1.add("Anbu");
		ts1.add("Arav");
		ts1.add("Anand");
		ts1.add("Aravind");

		System.out.println(ts1); // It will display the String in Descending Order.

	}

}
