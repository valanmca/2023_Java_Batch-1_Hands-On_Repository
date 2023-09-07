package com.shaji.Day05;

import java.util.TreeMap;

public class TreeMap_Assign2 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		map.put('A', (int) 'S');
		map.put('B', (int) 'H');
		map.put('C', (int) 'A');
		map.put('D', (int) 'J');
		map.put('E', (int) 'I');
		map.put('F', (int) 'B');

		System.out.println("Name in Capital Letters : " + map);
		
		System.out.println("B - ASCII Value is : " + map.get('B'));
		
		map.remove('D');
		System.out.println(map);

	}

}
