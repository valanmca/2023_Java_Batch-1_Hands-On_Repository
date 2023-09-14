package com.aravind.day5;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample5 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		ts.add("orange");
		ts.add("Apple");
		ts.add("Grapes");
		ts.add("Pineapple");
		ts.add("Aravind");
		System.out.println(ts);// [orange, Pineapple, Grapes, Aravind, Apple]

	}

}
