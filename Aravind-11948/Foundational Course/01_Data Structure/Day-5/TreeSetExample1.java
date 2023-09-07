package com.aravind.day5;

import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(8);
		ts.add(5);
		ts.add(7);
		ts.add(4);
		ts.add(1);
		
		System.out.println(ts);// [1, 4, 5, 7, 8]

	}

}
