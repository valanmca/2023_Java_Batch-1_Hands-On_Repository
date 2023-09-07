/********* Inserting Key Value Pairs in TreeMap(String)... *********/
package com.sara.day05;

import java.util.TreeMap;

public class TreeMap_Example1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		// Inserting Key Value Pairs
		map.put(1, "Java");
		map.put(5, "C");
		map.put(20, "Python");
		map.put(15, "C++");

		System.out.println(map);// {1=Java, 5=C, 15=C++, 20=Python}

		map.put(15, ".Net");
		System.out.println(map);// {1=Java, 5=C, 15=.Net, 20=Python}

	}

}
