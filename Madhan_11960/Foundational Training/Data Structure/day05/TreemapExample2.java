package com.madhan.day05;
import java.util.TreeMap;
public class TreemapExample2 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>();
		map.put('a',(int)'a');
		map.put('d',(int)'d');
		map.put('e',(int)'e');
		map.put('b',(int)'b');
		map.put('c',(int)'c');
		
		System.out.println(map);
		
		map.put('b', (int)'b');
		System.out.println(map); // It won't consider duplicate values.
		map.put('a', (int)'b');
		System.out.println(map); //This will update the values of a to b.
	}

}
