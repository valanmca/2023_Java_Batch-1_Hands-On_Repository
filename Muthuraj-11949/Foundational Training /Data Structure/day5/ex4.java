package com.muthu.day5;
import java.util.TreeMap;
public class ex4 {

	public static void main(String[] args) {
		TreeMap<Integer, String>map=new TreeMap<Integer,String>();
		map.put(10,"java");
		map.put(20,"c");
		map.put(5,"Python");
		map.put(15,"c++");
		
		System.out.println(map);
		
		map.put(15,"PHP");
		System.out.println(map);


	}

}
