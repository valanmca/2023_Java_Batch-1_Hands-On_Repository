package com.jeyavel.day5;
import java.util.TreeMap;
public class TreeMapExNo1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		//Used to insert the value in TreeMap
		map.put(10, "java");
		map.put(20, "Python");
		map.put(30,"c");
		map.put(40, "c++");
//		map.put(null, null);
		
		System.out.println("First Output");
		System.out.println(map);
		
		map.put(30, "Php");//Used to insert and change the value in TreeMap
		System.out.println("After change the key 30 the output" );
		System.out.println(map);

	}

}
