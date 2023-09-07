package com.matthew.day05;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(10, "java");
		map.put(5, "Python");
		map.put(20, "c");
		map.put(15, "c++");
		map.put(15, "r");
		map.put(30, "javaScript");
		System.out.println(map);
		for(int i =0;i<map.size();i++) {
			System.out.println(map.get(10));
		}
	}

}
