package com.gayathri.day5;

import java.util.Collections;
import java.util.TreeSet;

public class DescendingTreeSet {

	public static void main(String[] args) {

		TreeSet <String> ts= new TreeSet <String> (Collections.reverseOrder());
		//descending
		
		ts.add("sakthi");
		ts.add("vel");
		ts.add("Gayathri");
		ts.add("Devi");
		ts.add("Minion");
		System.out.println(ts);

	}

}
