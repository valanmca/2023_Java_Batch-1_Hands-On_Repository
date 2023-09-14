package com.muthu.day5;//BASIC OPERATION 
import java.util.TreeMap;
public class ex5 {

	public static void main(String[] args) {
		TreeMap<Character,Integer>map=new TreeMap<Character,Integer>();
		
		map.put('A',(int)'A');
		map.put('B',(int)'B');
		map.put('C',(int)'D');
		map.put('Z',(int)'Z');
		map.put('C',(int)'C');
		
		System.out.println(map);
		

	}

}
