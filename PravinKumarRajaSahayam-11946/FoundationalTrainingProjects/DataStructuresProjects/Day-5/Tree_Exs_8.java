//Using TreeMap for the Update and Remove and the display the output
package com.pravinkumar.day5;

import java.util.TreeMap;

public class Tree_Exs_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
//Using Ascending Order in the TreeMap for the Values
		map.put('A', (int) 'A');
		map.put('B', (int) 'B');
		map.put('D', (int) 'D');
		map.put('C', (int) 'C');
		map.put('Z', (int) 'Z');

		System.out.println(map);

//Get the values using ASCII Values in the map.get() 
		System.out.println("D - ASCII Value is : " + map.get('D'));

//Using the Remove Method in the TreeMap for the Values
		map.remove('D');

		System.out.println(map);
	}

}
