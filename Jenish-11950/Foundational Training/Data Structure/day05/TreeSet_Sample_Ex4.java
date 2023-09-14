package com.jenish.day05;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_Sample_Ex4 {

	public static void main(String[] args) {
		TreeSet<Integer> set1 = new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> set2 = new TreeSet<String>(Collections.reverseOrder());

		set1.add(90);
		set1.add(70);
		set1.add(50);
		set1.add(60);
		set1.add(80);
		
		System.out.println( set1);//Elements Displays in Number Descending order
		
		
		set2.add("car");
		set2.add("bike");
		set2.add("van");
		set2.add("truck");
		set2.add("cycle");
		
		System.out.println(set2);//Elements Displays in Number Descending order 

	}

}
