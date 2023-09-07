package com.shaji.Day05;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_Operations3 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		
		ts.add("Orange");
		ts.add("Mango");
		ts.add("Apple");
		ts.add("Grapes");
		ts.add("PineApple");
		ts.add("Apple");// Ignoring the Duplicate Sets...
		ts.add("Banana");
		
		System.out.println("Fruits : " + ts);// TreeSet Print in Descending order...(Alphabetical Order)


	}

}
