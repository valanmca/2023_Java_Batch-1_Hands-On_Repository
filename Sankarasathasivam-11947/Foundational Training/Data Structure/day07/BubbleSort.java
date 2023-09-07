package com.shiva.day07;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		System.out.println("enter the elements");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
