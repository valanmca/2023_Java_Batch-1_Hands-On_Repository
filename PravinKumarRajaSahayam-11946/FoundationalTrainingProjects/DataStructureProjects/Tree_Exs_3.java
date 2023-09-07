//While adding Duplicate
package com.pravinkumar.day5;

import java.util.TreeSet;

public class Tree_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Carrot");
		ts.add("Orange");
		ts.add("Add");
		System.out.println(ts);// During the TreeSet it will check all the letters in the input and do the
								// Ascending Order

		ts.add("ITS");
		System.out.println(ts);
//While adding duplicate Elements in the TreeSet it does not get any of the error or runtime it will print the output 
	}

}
