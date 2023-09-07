package com.shiva.day05;

import java.util.TreeSet;
import java.util.Collections;

public class TreeExampleDesc02 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree=new TreeSet<Integer>(Collections.reverseOrder());
		
		tree.add(8);
		tree.add(5);
		tree.add(3);
		tree.add(1);
		tree.add(7);
		
		System.out.println("The given values are "+tree);
	}

}