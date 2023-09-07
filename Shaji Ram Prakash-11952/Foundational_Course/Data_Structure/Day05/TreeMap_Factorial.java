package com.shaji.Day05;

import java.util.TreeMap;

public class TreeMap_Factorial {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int n=1; n<=10; n++) {
			int fact = 1;
			for(int i=1; i<=n; i++) {
				fact = fact*i;
			}
			map.put(n, fact);
		}
		System.out.println(map);
		
		System.out.println("Factorial of 11 : " + map.get(11));
		
		map.remove(11);
		System.out.println(map);
		
		System.out.println("Factorial of 11 : " + map.get(11));

	}

}
