package com.jenish.day05;
import java.util.TreeMap;
public class TreeSet_Sample_Ex6 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		TreeMap<Character,Integer> map2 = new TreeMap<Character,Integer>();
		
		map.put('A', (int)'A');
		map.put('D', (int)'D');
		map.put('C', (int)'C');
		map.put('Z', (int)'Z');
		
		System.out.println(map);//to print using ASCII value in Upper case Ascending Order
		
		map2.put('a', (int)'a');
		map2.put('d', (int)'d');
		map2.put('c', (int)'c');
		map2.put('z', (int)'z');
		System.out.println(map2);//to print using ASCII value in Lower case Ascending Order
		
	}

}
