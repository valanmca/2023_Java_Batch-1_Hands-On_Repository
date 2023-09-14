//TreeMap Factorial

package com.jeyandhan.day05;

import java.util.TreeMap;

import java.util.Scanner;
public class FactorialTreeMap {

	public static void main(String[] args) {
		TreeMap <Integer, Integer> map = new TreeMap<Integer, Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact = fact*j;
				
			}
			map.put(i, fact);
			
		}
		System.out.println(map);
		
		System.out.println("Factorial of 5 is: " + map.get(5));
		
		map.remove(5);
		System.out.println(map);
			}

}
