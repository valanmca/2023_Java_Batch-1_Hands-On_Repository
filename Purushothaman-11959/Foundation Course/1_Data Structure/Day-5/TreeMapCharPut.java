package com.purushoth.day5;

import java.util.TreeMap;

public class TreeMapCharPut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> map= new TreeMap<Character,Integer>();
		
		map.put('A', (int)'A');//To add character using ASCII value
		map.put('H', (int)'H');
		map.put('Z', (int)'Z');
		map.put('C', (int)'C');
		
		System.out.println(map);
		
		System.out.println("D-ASCII Value is : "+map.get('H'));
		
		map.remove('Z');
		System.out.println(map);



	}

}//To remove,get in TreeMap.
