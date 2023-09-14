
//Using Collections.reverseorder(Descending) to reverse the given TreeSet Elements
package com.jeyavel.day5;

import java.util.Collections;
import java.util.TreeSet;
public class TreeSetReverseOrder {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(12);
		ts.add(10);
		ts.add(1);
		ts.add(9);
		ts.add(3);
		ts.add(5);
		ts.add(2);
		ts.add(7);
		System.out.println("The Reverse Order Of the TreeSet is:"+ts);

	}

}
