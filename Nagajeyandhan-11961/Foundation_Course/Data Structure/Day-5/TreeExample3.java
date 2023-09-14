package com.jeyandhan.day05;

import java.util.TreeSet;

public class TreeExample3 {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();

		// Inserting elements
		tree.add(4);
		tree.add(1);
		tree.add(3);
		tree.add(5);
		tree.add(2);
		tree.add(2); // Duplicate value got ignored
		System.out.println(tree); // [1, 2, 3, 4, 5]
		
	}

	}


