//find the factorial and store in Tree map
package com.domnic.day5;

import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int n = 1; n <= 10; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			map.put(n, fact);
		}
		System.out.println(map);
		System.out.println("Entrer the value to be found :");
		int value = sc.nextInt();
		System.out.println("Factorial of " + value + " is " + map.get(value));
		System.out.println();
		System.out.println("Enter the value to be Removed :");
		int value1 = sc.nextInt();
		map.remove(value1);
		System.out.println(map);

	}

}
