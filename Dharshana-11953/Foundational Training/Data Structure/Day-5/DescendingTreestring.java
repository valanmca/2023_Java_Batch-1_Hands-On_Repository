package com.dharshu.day5;

import java.util.Collections;
import java.util.TreeSet;

public class DescendingTreestring {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());

		// Display the given string in Descending order
		ts.add("Dharshu");
		ts.add("Kavi");
		ts.add("Alagar");
		ts.add("Aadhi");
		ts.add("Maris");
		ts.add("Minion");
		ts.add("Dora");

		System.out.println(ts);

	}

}
