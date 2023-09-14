package com.naveen.day5;

import java.util.TreeMap;

public class TreeEx06 {

	public static void main(String[] args) {
		// Tree Map using Character and Integer
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');

		System.out.println(map); // Display the key value pair in ascending order.
		
		
		

	}

}
