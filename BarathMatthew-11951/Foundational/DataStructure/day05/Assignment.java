package com.matthew.day05;
import java.util.TreeMap;
public class Assignment {

	public static void main(String[] args) {
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		map.put('A', (int)'A');
		map.put('H', (int)'H');
		map.put('D', (int)'D');
		map.put('R', (int)'R');
		map.put('Z', (int)'Z');
		map.put('T', (int)'T');
		map.put('L', (int)'L');
		map.put('C', (int)'C');                 
		System.out.println(map);
	}

}
