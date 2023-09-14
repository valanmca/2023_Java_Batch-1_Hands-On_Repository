package com.aravind.day5;

import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "java");
		map.put(5, "c");
		map.put(20, "python");
		map.put(15, "c++");
		System.out.println(map);
		System.out.println(" the  valueof key  ="+map.get(5));
		System.out.println(map.remove(15));
		System.out.println(map);

	}

}
