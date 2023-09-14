//Add elements in TreeSet(String)

package com.jeyandhan.day05;

import java.util.TreeSet;

public class TreeExampl1 {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();

		// Inserting elements
		tree.add("Jeyandhan");
		tree.add("Sara");
		tree.add("Shaji");
		tree.add("Mahesh");
		tree.add("Jeyavel");
		tree.add("");
		System.out.println(tree); // [,Jeyandhan, Jeyavel, Mahesh, Sara, Shaji]

	}

}
