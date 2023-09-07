package com.madhan.day05;

import java.util.TreeMap;

public class TreemapExample1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "java");
		map.put(5, "c");
		map.put(20, "c++");
		map.put(25, "python");
		map.put(30, "php");
		map.put(10, "c--");
		map.put(null, "MM"); //Null Pointer Exception
		

		System.out.println(map);

		map.put(20, "php"); // It will update the treemap
		System.out.println(map);
	}

}
