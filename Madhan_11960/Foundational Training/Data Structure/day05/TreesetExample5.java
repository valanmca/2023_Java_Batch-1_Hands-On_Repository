package com.madhan.day05;

import java.util.TreeSet;
import java.util.Collections;

public class TreesetExample5 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		ts.add("madhan");
		ts.add("Aravindh");
		ts.add("Sankar");
		ts.add("Vijay");
		ts.add("Sam");
		
		System.out.println(ts);

	}

}
