package com.shiva.day07;

import java.util.Scanner;
import java.util.ArrayList;

public class SelectionSort {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
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
			for(int j=i+1;j<size;j++)
			{
				if(list.get(i)>list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j,temp);
				}
			}
		}
		System.out.println("After sorting");
		System.out.println(list);
	}

}
