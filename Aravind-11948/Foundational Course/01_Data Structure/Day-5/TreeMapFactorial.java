package com.aravind.day5;
import java.util.TreeMap;
import java.util.Scanner;
public class TreeMapFactorial {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value of n = ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
				
			}
			map.put(i,fact);
		}
		System.out.println("factorial key,value"+map);
		
		System.out.println("factorial of 5="+map.get(5));
		
		map.remove(5);
		System.out.println(map);
		
		

	}

}
