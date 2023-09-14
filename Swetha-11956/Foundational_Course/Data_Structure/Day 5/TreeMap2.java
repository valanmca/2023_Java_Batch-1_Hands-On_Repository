package com.swetha.day5;
import java.util.TreeMap;
public class TreeMap2 {
	public static void main(String[] args) {
		
		TreeMap<Character,Integer>map=new TreeMap<Character,Integer>();
		
		//  System.out.println((int)'A');.....Print the ASCII value of A--65
		
		map.put('S', (int)'S');
		map.put('W', (int)'W');
		map.put('E', (int)'E');
		map.put('T', (int)'T');
		map.put('H', (int)'H');
		map.put('A', (int)'A');
		
		
		//Prints the ASCII values of alphabets in ascending order based on the key.
		System.out.println(map);
	}

}
