package com.swetha.day5;
import java.util.TreeMap;
public class TreeMap1 {

	public static void main(String[] args) {
		
		//Creating TreeMap Including Integer and string as generics for key and value,
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		
		map.put(10,"Java");
		map.put(5,"C");
		map.put(20,"Python");
		map.put(15,"C++");
		
		//Prints in ascending order based on the key 
		System.out.println(map);
		
		//Modifying the value of Key=15  ,C++ is replaced with PHP...
		map.put(15, "PHP");
		System.out.println(map);
		

	}

}
