package com.shiva.day02;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {10,20,30};
		System.out.println("Sum of Array");
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
