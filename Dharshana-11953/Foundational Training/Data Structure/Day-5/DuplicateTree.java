package com.dharshu.day5;

import java.util.TreeSet;

public class DuplicateTree {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		//it skip the duplicate value ,does not throw any error 
		ts.add(3);
		ts.add(8);
		ts.add(9);
		ts.add(3);
		ts.add(10);
		
		System.out.println(ts);
	}

}
