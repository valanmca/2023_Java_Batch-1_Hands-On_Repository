//performs remove and get method in treemap

package com.madhan.day05;
import java.util.TreeMap;
public class TreemapExample3 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> map=new TreeMap<Character,Integer>();
		map.put('a',(int)'a');
		map.put('d',(int)'d');
		map.put('e',(int)'e');
		map.put('b',(int)'b');
		map.put('c',(int)'c');
		
		System.out.println(map);
		System.out.println("D- ASCII Value is :" +map.get('d'));
	
		System.out.println(map.remove('d'));
		System.out.println(map);
		

	}

}
