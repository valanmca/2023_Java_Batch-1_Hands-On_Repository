
//Finding and Removing the Element in the TreeMap
package com.jeyavel.day5;

import java.util.TreeMap;

public class TreeMapExNo3 {

	public static void main(String[] args) {
TreeMap<Character,Integer> tmap = new TreeMap<Character,Integer>();
		
		tmap.put('A',(int)'A');
		tmap.put('Z',(int)'Z');
		tmap.put('C',(int)'C');
		tmap.put('B',(int)'B');
		tmap.put('J',(int)'J');
		
		System.out.println(tmap);                             //using get() to find the Particular Element
		System.out.println("The Ascii value of the Given Value is = " + tmap.get('C'));
		
		tmap.remove('C');//to remove the Particular Element 
		System.out.println("After removing the Element"+"\n"+tmap);
		

	}

}
