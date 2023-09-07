package com.shiva.day07;

import java.util.LinkedList;
import java.util.Scanner;

public class BubbleSortDescLinked {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++)
		{
			int value=sc.nextInt();
			list.add(value);
		}
		System.out.println(list);
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(list.get(j)<list.get(j+1))
				{
					int temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
		System.out.println("After bubble sort");
		System.out.println(list);
		
	
	}

}
