package com.naveen.day5;

import java.util.TreeSet;
public class TreeEx01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		//Display the input in Ascending order - Integer
		
		ts.add(8);
		ts.add(5);
		ts.add(3);
		ts.add(1);
		ts.add(7);
		ts.remove(9);

		System.out.println(ts);
		
		
		
	}

}
