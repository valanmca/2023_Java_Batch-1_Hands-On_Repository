package com.madhan.day05;
import java.util.TreeSet;
import java.util.Collections;

public class TreesetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(Collections.reverseOrder());
		ts.add(10);
		ts.add(200);
		ts.add(40);
		ts.add(5);
		ts.add(10000);
		ts.add(5);
		ts.remove(5);
//		ts.add(null); // it shows, Null pointer exception
		
		System.out.println(ts); 

	}

}
