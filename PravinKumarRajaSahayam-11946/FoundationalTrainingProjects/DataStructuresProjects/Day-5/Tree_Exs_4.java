//Its will help us to print the values in the Descending Order using the TreeSet
package com.pravinkumar.day5;

import java.util.Collections;
import java.util.TreeSet;

public class Tree_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Collections.reverseOrder() Method to Descending Order
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		ts.add("Apple");
		ts.add("Banana");
		ts.add("Carrot");
		ts.add("Tree");
		ts.add("Odd");
		System.out.println(ts);
	}

}
