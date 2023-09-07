package com.matthew.day05;

import java.util.TreeMap;
public abstract class MapDemo {
	//Sort according to key
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(10, "jave");
		map.put(5, "Python");
		map.put(20, "c");
		map.put(15, "c++");
		map.put(15, "r");
		map.put(30, "javaScript");
		System.out.println(map);
	}

}
