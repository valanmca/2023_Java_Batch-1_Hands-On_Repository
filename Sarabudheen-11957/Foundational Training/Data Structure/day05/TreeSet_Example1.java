package com.sara.day05;

import java.util.TreeSet;

public class TreeSet_Example1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		// Inserting elements 
		ts.add(5);
		ts.add(9);
		ts.add(2);
		ts.add(1);
		ts.add(6);
		
		System.out.println(ts);//[1, 2, 5, 6, 9]


	}

}
