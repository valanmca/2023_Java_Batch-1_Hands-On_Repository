package com.shiva.day05;

import java.util.TreeMap;

public class TreeMapBasic {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		
		map.put(10,"Java");//Prints in the order of key value
		map.put(05,"C");
		map.put(20,"Python");
		map.put(15, "C++");
		
		
		System.out.println("The Given values are :"+map);
		
		map.put(15, "PHP");
		System.out.println("It overwrites the Value :"+map);

	}

}
