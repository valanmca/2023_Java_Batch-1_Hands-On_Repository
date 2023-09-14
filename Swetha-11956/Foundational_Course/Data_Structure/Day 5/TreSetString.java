package com.swetha.day5;
import java.util.TreeSet;
public class TreSetString {

	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		
		//Creating TreeSet using String
		ts.add("banyan");
		ts.add("apple");
		ts.add("orange");
		ts.add("banana");
		
		//Print the elements in Ascending order by comparing all the values
		System.out.println(ts);
	}

}
