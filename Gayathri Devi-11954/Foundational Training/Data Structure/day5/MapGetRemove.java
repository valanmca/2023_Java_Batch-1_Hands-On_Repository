package com.gayathri.day5;

import java.util.TreeMap;

public class MapGetRemove {

	public static void main(String[] args) {
		//finding and removing
		TreeMap <Character,Integer> tm = new TreeMap <Character, Integer> ();
		//map comes with 2 generics 1 for key another for value
		//insert
		tm.put('A', (int)'A');//it return the ascii value of a
		tm.put('B', (int)'B');
		tm.put('a', (int)'a');
		tm.put('D', (int)'D');
		tm.put('E', (int)'E');
		System.out.println(tm);
		
//get the value using key
		System.out.println("\n a ascii value : "+tm.get('a'));
		System.out.println("\n A ascii value : "+tm.get('A'));
		
//remove
		tm.remove('E');
		System.out.println("\n After removing E : "+tm);
	}

}
