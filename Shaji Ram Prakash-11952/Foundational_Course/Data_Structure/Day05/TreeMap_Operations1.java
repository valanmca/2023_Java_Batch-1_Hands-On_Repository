package com.shaji.Day05;

import java.util.TreeMap;

public class TreeMap_Operations1 {

	public static void main(String[] args) {
		TreeMap <Character, Integer> map = new TreeMap<Character, Integer>();
		
		map.put('A', (int)'S');
		map.put('B', (int)'H');
		map.put('C', (int)'A');
		map.put('D', (int)'J');
		map.put('E', (int)'I');

		System.out.println("Name in Capital Letters : " + map);
		
		map.put('A', (int)'s');
		map.put('B', (int)'h');
		map.put('C', (int)'a');
		map.put('D', (int)'j');
		map.put('E', (int)'i');
		
		System.out.println("Name in Small Letters : " + map);

	}

}
