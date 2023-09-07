package com.shiva.day05;

import java.util.TreeMap;

public class TreeMapExampleRemove {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');
		
		System.out.println(map);
		
		System.out.println("D - ASCII Value is : "+map.get('D'));
		
		map.remove('D');
		System.out.println(map);//Removing the value in the list
	}

}
