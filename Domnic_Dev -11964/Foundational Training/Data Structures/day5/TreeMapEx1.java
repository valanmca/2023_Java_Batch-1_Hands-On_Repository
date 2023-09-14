//basic operations on TreeMap
package com.domnic.day5;
import java.util.TreeMap;
public class TreeMapEx1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(10, "Java");
		map.put(5, "c");
		map.put(9, "Oops");
		map.put(12, "Data Structure");
		map.put(6, "Collection");
		
		System.out.println(map);
		System.out.println();
		map.put(5, "Framework");
		map.put(12, "Array");
		
		System.out.println(map);

	}

}
