package com.shiva.day05;

import java.util.TreeSet;
import java.util.Collections;

public class TreeExampleDesc01 {

	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet<String>(Collections.reverseOrder());
		
		tree.add("Apple");
		tree.add("Orange");
		tree.add("peach");
		tree.add("Banana");
		tree.add("Pineapple");
		
		System.out.println("The given values are "+tree);
	}

}