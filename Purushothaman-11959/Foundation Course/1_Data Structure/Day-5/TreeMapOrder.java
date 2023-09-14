package com.purushoth.day5;
import java.util.TreeMap;

public class TreeMapOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> map= new TreeMap<Character,Integer>();
		TreeMap<Character,Integer> map1= new TreeMap<Character,Integer>();

		
		map.put('A', (int)'A');//To add character using ASCII value
		map.put('H', (int)'H');
		map.put('Z', (int)'Z');
		map.put('C', (int)'C');
		
		System.out.println(map);//To print using ASCII value ascending order
		
		map1.put('a', (int)'a');
		map1.put('d', (int)'d');
		map1.put('y', (int)'y');
		map1.put('k', (int)'k');
		
		System.out.println(map1);//To print using ASCII value ascending order

		

	}

}
