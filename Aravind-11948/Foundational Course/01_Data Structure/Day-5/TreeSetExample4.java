package com.aravind.day5;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample4 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(8);
		ts.add(5);
		ts.add(7);
		ts.add(4);
		ts.add(1);
		System.out.println(ts);// [8, 7, 5, 4, 1] print in reverse order

	}

}
