//Find the Factorial number 1-10 using TreeMap values
package com.pravinkumar.day5;

import java.util.TreeMap;

public class Tree_Exs_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
//Print the Output in the Factorial using TreeMap
		for (int n = 1; n <= 10; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			map.put(n, fact);
		}
		System.out.println(map);

//Find or Get the Particular Number in the Factorial so using map.get(Inside this or it put the value
		System.out.println("Factorial of 5 : " + map.get(5));

//Remove the number in the Factorial Values
		map.remove(5);
		System.out.println(map);
	}

}
