package com.shiva.day01;

import java.util.Scanner;

public class ArrayExample04 {

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		System.out.println("Enter the Array Elements ");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("Enter the value to be searched ");//searching the value
		
		int n=sc.nextInt();
		
		int temp=0;		//assigning temp variable
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==n)
			{
				System.out.println("it is in the index of "+i+ " and the value is "+n);//printing the index of the number
				temp=1;
				break;
	       }
		}
		if(temp==0)
		{
			System.out.println(-1);
		}
		

	}

}
