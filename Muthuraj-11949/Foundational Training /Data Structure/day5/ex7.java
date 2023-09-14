package com.muthu.day5;

import java.util.TreeMap;

public class ex7 {

	public static void main(String[] args) {
		TreeMap<Character,Integer>map=new TreeMap<Character,Integer>();
		
		map.put('A',(int)'A');
		map.put('B',(int)'B');
		map.put('D',(int)'D');
		map.put('Z',(int)'Z');
		map.put('C',(int)'C');
		
		System.out.println(map);
		
	System.out.println("D-ASCII Value is"+map.get('D'));
	
map.remove('D');
System.out.println(map);
	}}
