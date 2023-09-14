//Finding and removing the Values from map
package com.domnic.day5;

import java.util.TreeMap;
public class TreeMapEx4 {

	public static void main(String[] args) {
		
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
        map.put('A', (int)'A');
        map.put('B', (int)'B');
        map.put('C', (int)'C');
        map.put('L', (int)'L');
        map.put('M', (int)'M');
        
        System.out.println(map);
        
        System.out.println("THE ascii value of M is :"+map.get('M'));  //getting the details with the help of key
        
        map.remove('A');         //removing A with help of key
        System.out.println(map);
	}

}
