package com.jenish.day05;

import java.util.TreeMap;

public class TreeSet_Sample_Ex9 {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		for(int i=0; i<=10; i++) {
			int fact=1;
			for(int j=0; j<=i; j++) {
				fact=fact*i;
			}
			map.put(i, fact);
		}
		System.out.println(map);
		
		System.out.println("Factorial of 7:" +map.get(7));
	map.remove(7);
	System.out.println(map);
	}

}
