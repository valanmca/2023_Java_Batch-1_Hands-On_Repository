package com.naveen.day5;

import java.util.TreeMap;

public class TreeEx08 {

	public static void main(String[] args) {
		// Finding and removing element form tree map.
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');

		System.out.println(map); // Display the key value pair in ascending order.
		
		System.out.println("D - ASCII Value  is :" + map.get('D'));
		
		map.remove('D');
		System.out.println(map);
		
		

	}

}
