package com.madhan.day07;

import java.util.Scanner;



public class SelectionsortArray {

	public static void main(String[] args) {
	
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<size;j++)
			{
				if(arr[minIndex]>arr[j])
				{
					minIndex=j;
				}
			}
					int temp=arr[i];
					arr[i]=arr[minIndex];
					arr[minIndex]=temp;
		}
			
		
		System.out.println("The sorted elements are:");
		for(int i=0;i<size;i++)
		{
		System.out.println(arr[i]);
		}
	
	}

}
