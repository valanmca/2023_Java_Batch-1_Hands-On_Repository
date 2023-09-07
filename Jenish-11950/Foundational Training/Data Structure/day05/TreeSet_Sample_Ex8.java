package com.jenish.day05;

import java.util.TreeMap;

public class TreeSet_Sample_Ex8 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');
		
		System.out.println(map);
		System.out.println("D - ASCII Value is:" +map.get('B'));
		
		map.remove('Z');
		System.out.println(map);

	}

}
