package com.shiva.day01;

import java.util.Scanner;

public class ArrayExample03 
	{
	public static void main(String[] args)
		{
		boolean arr[]=new boolean[5];
		System.out.println("Initial Array Elements are : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}

		System.out.println("Enter "+arr.length+"Values");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextBoolean();
			
		}
		System.out.println("New Array Elements are : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}

	}
}
