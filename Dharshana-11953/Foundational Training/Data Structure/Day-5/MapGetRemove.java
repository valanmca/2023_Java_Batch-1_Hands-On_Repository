package com.dharshu.day5;

import java.util.TreeMap;

public class MapGetRemove {
       //Finding and removing the element in a treemap
	public static void main(String[] args) {
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// default it display the output in ascending order
		// Key is just a label
		tm.put('A', (int) 'A');// it return the ASCII value of 'A'
		tm.put('a', (int) 'a');
		tm.put('Z', (int) 'Z');
		tm.put('v', (int) 'V');
		tm.put('D', (int) 'D');

		System.out.println(tm);//{A=65,D=68,Z=90,a=97,v=86}
		
		System.out.println("D--ASCII value is:"+tm.get('D'));//68 ASCII value of D
		
		tm.remove('a');
		System.out.println(tm);//{A=65,D=68,Z=90,v=86}

	}

}
