package com.jenish.day05;

import java.util.TreeSet;

public class TreeSet_Sample_Ex3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("car");
		set.add("bike");
		set.add("van");
		set.add("truck");
		set.add("cycle");
		
		System.out.println("Values:" +set);//Elements Displaying in Alphabetical Order
		set.add("car");
		System.out.println(set);// Adding Same Elements to Check Whether it is duplicate are not.
	}

}
