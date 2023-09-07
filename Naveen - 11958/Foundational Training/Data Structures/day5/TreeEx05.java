package com.naveen.day5;

import java.util.TreeMap;

public class TreeEx05 {

	public static void main(String[] args) {
		// Tree Map Example.
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(10, "Java");
		map.put(5, "C");
		map.put(20, "Python");
		map.put(15, "C++");
		map.put(11, "Java");

		System.out.println(map);

		map.put(15, "PHP"); //Updating the key 15
		System.out.println(map);
		
	}

	
}
