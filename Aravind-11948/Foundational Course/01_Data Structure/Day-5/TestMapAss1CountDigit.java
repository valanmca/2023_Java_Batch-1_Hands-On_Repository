package com.aravind.day5;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
public class TestMapAss1CountDigit {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  size");
		int size=sc.nextInt();
		System.out.println("enter the list values ");
		for(int i=0;i<size;i++)
		{
			int val=sc.nextInt();
			list.add(val);
			
		}
		System.out.println("list : "+list);
		System.out.print("digitcount : ");
		System.out.print("{");
		
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		int count =0;
		for(int i=0;i<size;i++)
		{
			if(list.get(i)==0)
			{
				count=1;
				int key=list.get(i);
				System.out.print(count+",");
				map.put(key,count);
			}
			
			else
			{
			count=0;
			int temp=list.get(i);
			int key=temp;
			while(temp!=0)
			{
				
				temp=temp/10;
				count++;

				}
			System.out.print(count+",");
			map.put(key,count);
			}
			
		}
		System.out.println("}");
		
		System.out.println("map : "+map);
		
		

	}

}
