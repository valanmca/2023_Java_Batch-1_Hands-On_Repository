package com.shiva.day05;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapFact {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		
		
		for(int n=1;n<=size;n++)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			map.put(n,fact);
		}
		System.out.println(map);
		
		System.out.println("Factorial of 5 : "+map.get(5));
		
		map.remove(5);
		System.out.println(map);
	}

}
