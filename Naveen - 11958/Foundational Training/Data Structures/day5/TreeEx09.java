package com.naveen.day5;

import java.util.TreeMap;

public class TreeEx09 {

	public static void main(String[] args) {
		// TODO factorial values storing in the map.

		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int n = 1; n <= 10; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			map.put(n, fact);
		}
		System.out.println(map);

		System.out.println("Factorial of 5 : " + map.get(5));

		map.remove(5);
		System.out.println(map);
	}

}
