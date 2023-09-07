package com.swetha.day5;

import java.util.TreeSet;

public class AddingDuplicates {

	public static void main(String[] args) {
TreeSet<String>ts=new TreeSet<String>();
		
		//Creating TreeSet using String
		ts.add("banyan");
		ts.add("banyan");         //Simply ignoring the duplicate values in set
		ts.add("apple");
		ts.add("orange");
		ts.add("banana");
		
		//Print the elements in Ascending order by comparing all the values
		System.out.println(ts);
		
	}

	}


