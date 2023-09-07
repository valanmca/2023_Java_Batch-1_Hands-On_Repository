package com.gayathri.day5;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap <Integer, String> tm = new TreeMap <Integer, String> ();
		//map comes with 2 generics 1 for key another for value
		//insert
		tm.put(10, "Java");
		tm.put(1, "C");
		tm.put(15, "C++");
		tm.put(9, ".NET");
		tm.put(2, "Python");
		//tm.put(null,null); throw null pointer exception
		System.out.println(tm);
		
		tm.put(2,"HTML");//replace
		System.out.println(tm);

	}

}
