package com.shiva.day01;
import java.util.*;
public class ArrayExample05 {

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial Array Elements are : ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];//maximum value to be printed
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
			max=arr[i];
			
		}
		}
		System.out.println(max);
		
		int min=arr[0];//minimum value to be printed
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
