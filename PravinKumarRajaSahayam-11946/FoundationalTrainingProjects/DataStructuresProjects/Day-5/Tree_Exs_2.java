//Take the input using TreeSet in the String
package com.pravinkumar.day5;

import java.util.TreeSet;

public class Tree_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
//It will Automatically print in Ascending Order 
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Carrot");
		ts.add("Orange");
		ts.add("Mango");
		ts.add("Apples");
		System.out.println(ts);
	}

}
