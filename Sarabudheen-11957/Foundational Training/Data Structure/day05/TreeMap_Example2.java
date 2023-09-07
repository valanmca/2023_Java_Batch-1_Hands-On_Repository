package com.sara.day05;

import java.util.TreeMap;

public class TreeMap_Example2 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();

		// Inserting Key Value Pairs
		map.put('A', (int)'A');
		map.put('K', (int)'K');
		map.put('V', (int)'V');
		map.put('Z', (int)'Z');
		
		System.out.println(map);//{A=65, K=75, V=86, Z=90}
	}

}
