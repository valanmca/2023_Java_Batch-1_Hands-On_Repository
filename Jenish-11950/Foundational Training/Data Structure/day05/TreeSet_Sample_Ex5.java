package com.jenish.day05;
import java.util.TreeMap;

public class TreeSet_Sample_Ex5 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(10, "JAVA");
		map.put(5, "C");
		map.put(15, "PYTHON");
		map.put(20, "C++");
		
		System.out.println(map);// Listed Elements using key Ascending order
		
		map.put(15, "PHP");
		System.out.println(map);
//To add elements in tree map
	}

}
