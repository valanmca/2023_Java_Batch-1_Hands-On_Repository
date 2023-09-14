package com.jeban.day5;//know ASCII value and remove the value

import java.util.TreeMap;

public class Treemap8 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

		map.put('A', (int) 'A');
		map.put('B', (int) 'B');
		map.put('C', (int) 'C');
		map.put('D', (int) 'D');
		map.put('Z', (int) 'Z');
		map.put('H', (int) 'H');
		map.put('U', (int) 'U');

		System.out.println("D- ASCII Value is :"+ map.get('D'));//display d's ASCII value
		
		map.remove('D');
		System.out.println(map);
		

	}

}
