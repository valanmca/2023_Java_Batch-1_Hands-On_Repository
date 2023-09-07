//Using Character , Integer for the put TreeMap in the Ascending Order
package com.pravinkumar.day5;

import java.util.TreeMap;

public class Tree_Exs_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		//For the ('A'->Character,(int) 'A'->AscII Values with the help of the integer
		map.put('A', (int) 'A');
		map.put('D', (int) 'D');
		map.put('B', (int) 'B');
		map.put('C', (int) 'C');
		map.put('Z', (int) 'Z');
		System.out.println(map);
	}

}
