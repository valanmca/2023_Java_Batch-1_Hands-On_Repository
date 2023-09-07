package com.shiva.day01;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		System.out.println("Initial Array Elements are : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);//prints the null values
		}

		System.out.println("Enter " +arr.length+ " Values");
		Scanner sc=new Scanner(System.in);
		
		//Replacing new values
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();	
		}
		System.out.println("New Array Elements are : ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

}
}
