package com.swetha.day5;
import java.util.TreeMap;
public class GetMethod {

	public static void main(String[] args) {
		
		//Finding the value in treeMap using the 'key'
		
		TreeMap<Character,Integer>map=new TreeMap<Character,Integer>();
		
		map.put('S', (int)'S');
		map.put('W', (int)'W');
		map.put('E', (int)'E');
		map.put('T', (int)'T');
		map.put('H', (int)'H');
		map.put('A', (int)'A');
		
		System.out.println(map);
		
		//getting ASCII value of 'S' by using its key "S"
		System.out.println("S ASCII value is : "+map.get('S'));
		
		map.remove('W'); //Removing 'W'from the treeMap
		System.out.println(map);
		

	}

}
