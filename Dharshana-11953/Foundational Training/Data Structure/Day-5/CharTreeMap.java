package com.dharshu.day5;

import java.util.TreeMap;

public class CharTreeMap {

	public static void main(String[] args) {
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		
		//default it display the output in ascending order
		//Key is just a label
		tm.put('A',(int)'A');//it return the ASCII value of 'A'
		tm.put('a',(int)'a');
		tm.put('Z',(int)'Z');
		tm.put('v',(int)'V');
		tm.put('D',(int)'D');
		
		System.out.println(tm);
		


	}

}
