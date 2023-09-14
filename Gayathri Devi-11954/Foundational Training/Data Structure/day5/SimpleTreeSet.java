package com.gayathri.day5;

import java.util.Collections;
import java.util.TreeSet;

public class SimpleTreeSet {

	public static void main(String[] args) {
	TreeSet <Integer> ts =new TreeSet <Integer> (Collections.reverseOrder());//ascendng order
	ts.add(8);
	ts.add(5);
	ts.add(1);
	ts.add(9);
	
	//ts.remove(1);
	
	System.out.println(ts);	
	}

	

}
