package com.domnic.day5;

import java.util.TreeSet;

public class TreesetEx3 {

	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("Pursh");
		ts1.add("Muthurasu");
		ts1.add("Jeban");
		ts1.add("Ignesh");
		ts1.add("Sara");                     //it will ignore duplicate values
		ts1.add("Shaji");
		ts1.add("Jeban");
		
		System.out.println(ts1);

	}

}
