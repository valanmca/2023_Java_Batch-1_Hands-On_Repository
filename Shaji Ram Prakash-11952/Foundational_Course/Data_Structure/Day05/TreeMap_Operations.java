package com.shaji.Day05;

import java.util.TreeMap;

public class TreeMap_Operations {

	public static void main(String[] args) {
		TreeMap <Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(10, "Java");//Inserting Map Elements... 
		map.put(5, "C");
		map.put(20, "Python");
		map.put(15, "C++");

		System.out.println(map);//{5=C, 10=Java, 15=C++, 20=Python}
		
		map.put(15, "PHP");
		System.out.println(map);//{5=C, 10=Java, 15=PHP, 20=Python}

	}

}
