

//first TreeSet compare Symbols , then Numbers ,then Strings
//String operation using TreeSet
package com.jeyavel.day5;

import java.util.TreeSet;

public class TreeSetExNo2 {

	public static void main(String[] args) {
TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Apple");
		ts.add("$Jeyavel");
		ts.add("Jeyanthan");
		ts.add("Levis");
		ts.add("Point");
		ts.add("Ball");
//		ts.add(null);
		System.out.println("The TreeSet Elements"+ts);
		
		

	}

}
