package com.purushoth.day5;
import java.util.TreeMap;

public class TreeMapPutRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		
		map.put(10, "Java");//To add values.
		map.put(5, "C");
		map.put(20, "Python");
		map.put(15, "C++");
		
		System.out.println(map);//Listed elements using key ascending order. 
		
		map.put(15, "Php");
		System.out.println(map);
		
		map.remove(10, "Java");//To delete
		System.out.println(map);
		
		

	}

}//To add elements in tree map.
