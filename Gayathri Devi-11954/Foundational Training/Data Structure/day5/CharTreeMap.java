package com.gayathri.day5;

import java.util.TreeMap;

public class CharTreeMap {

	public static void main(String[] args) {
		
		TreeMap <Character , Integer> tm = new TreeMap <Character , Integer> ();
		
		tm.put('A', (int)'A');//it return the ascii value of a
		tm.put('B', (int)'B');
		tm.put('a', (int)'a');
		tm.put('D', (int)'D');
		tm.put('E', (int)'E');
		//automatically result will be present in ascending order.
		//key is just a label.
		//value la namma enna kudukuromo athan ans varum.
		System.out.println(tm);
	}

}
