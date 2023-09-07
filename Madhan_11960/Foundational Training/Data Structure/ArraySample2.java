package com.madhan.day01;

import java.util.Scanner;

public class ArraySample2 {

	public static void main(String[] args) {
		boolean arr[]=new boolean[5];   // If there is -1,it is NegativeArraySizeException
		System.out.println("Initial array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter" + arr.length + "values :");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextBoolean();
		}
		System.out.println("New array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
