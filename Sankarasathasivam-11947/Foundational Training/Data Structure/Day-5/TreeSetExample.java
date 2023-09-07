
//This program sorting in ascending Automatically without using any commands

//Prints based on Capital first and then Small

package com.shiva.day05;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> tree=new TreeSet<String>();
		
		tree.add("Apple");
		tree.add("Orange");
		tree.add("peach");
		tree.add("Banana");
		tree.add("Pineapple");
		
		System.out.println("The given values are "+tree);
	}

}