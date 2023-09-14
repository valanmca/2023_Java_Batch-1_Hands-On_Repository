package com.madhan.day05;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Collections;

public class TreemapFactorialass {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> map=new TreeMap<Integer, Integer>(Collections.reverseOrder());
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			map.put(i, fact);
		}
    System.out.println(map);
    System.out.println("Factorial of 5:"+map.get(5));
    map.remove(2,2);
    System.out.println(map);
	}

}
