package com.shiva.day05;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		
		map.put('A', (int)'A');//Prints the ASCII value of given Character
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');
		
		map.put('z', (int)'z');
		
		System.out.println(map);

	}

}
