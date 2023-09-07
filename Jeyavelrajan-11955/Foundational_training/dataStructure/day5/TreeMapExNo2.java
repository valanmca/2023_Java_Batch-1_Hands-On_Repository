// use (type casting) to display Ascii values of the given input 
package com.jeyavel.day5;
import java .util.TreeMap;
public class TreeMapExNo2 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> tmap = new TreeMap<Character,Integer>();
		
		tmap.put('A',(int)'A');
		tmap.put('Z',(int)'Z');
		tmap.put('C',(int)'C');
		tmap.put('B',(int)'B');
		tmap.put('J',(int)'J');
		
		System.out.println("The Ascii value of the Given Values is");
		System.out.println(tmap);

	}

}
