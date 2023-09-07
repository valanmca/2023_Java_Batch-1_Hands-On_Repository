package com.naveen.day5;

import java.util.TreeSet;
public class TreeEx02 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		//Display the input in Alphabetical order - String
		
		ts.add("Arasu");
		ts.add("Anbu");// The Tree compares all the literals and do the sorting. It not only checks the
						// First Letter.
		ts.add("Arav");
		ts.add("Anand");
		ts.add("Aravind");

		System.out.println(ts);		
		
		
	}

}
