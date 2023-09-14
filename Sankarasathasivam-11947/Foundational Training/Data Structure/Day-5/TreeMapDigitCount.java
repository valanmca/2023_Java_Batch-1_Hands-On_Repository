package com.shiva.day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDigitCount {

	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<Integer>();
		System.out.println("Enter the size");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the Elements");
		
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			array.add(value);
		}
		System.out.println(array);

		
		TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		int count=0;
		for (int i = 0; i < n; i++) 
		{
			if(array.get(i)==0)
			{
				count=1;
				int key=array.get(i);
				map.put(key, count);
			}
			else
			{
				count=0;
				int temp =array.get(i);
				int key=temp;
				while (temp!=0) 
				{
					temp = temp / 10;
					count++;
				}
				map.put(key,count);
			}
		}
		System.out.println(map);
			
			
	}
}
