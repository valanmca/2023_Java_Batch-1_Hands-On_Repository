package com.dharshu.day5;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		//Generic Integer for "Key",The String Generic for "Value"
		
		//insertion
		tm.put(10, "Java");
		tm.put(1, "null");
		//tm.put(null,"null");----throw the nullpointerexception error.
		tm.put(0, "C++");
		tm.put(5, "Python");
		tm.put(3, "Php");
		tm.put(4, "Ds");
		
		System.out.println(tm);
		//Ascending order is performed in the basic of the "key"
		
		tm.put(5, "Os");
		System.out.println(tm);
		//just replace the value
	}

}
