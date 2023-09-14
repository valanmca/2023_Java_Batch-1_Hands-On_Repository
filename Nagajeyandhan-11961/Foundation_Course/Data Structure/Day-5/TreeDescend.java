//TreeDescending

package com.jeyandhan.day05;

import java.util.TreeSet;

import java.util.Collections;

public class TreeDescend {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>(Collections.reverseOrder());
		TreeSet<String> tree1 = new TreeSet<String>(Collections.reverseOrder());

		// Inserting elements
		tree.add(4);
		tree.add(1);
		tree.add(3);
		tree.add(5);
		tree.add(2);
		tree.add(2); // Duplicate value got ignored
		System.out.println(tree); // [5, 4, 3, 2, 1]
		
		tree1.add("Jeyandhan");
		tree1.add("Sara");
		tree1.add("Shaji");
		tree1.add("Mahesh");
		tree1.add("Jeyavel");
		System.out.println(tree1); // [Shaji, Sara, Mahesh, Jeyavel, Jeyandhan]
	}

}
