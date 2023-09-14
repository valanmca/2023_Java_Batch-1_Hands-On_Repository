package com.shiva.day17;

import java.util.Scanner;
import java.util.LinkedList;

public class Assignment04 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[4];		
		System.out.println("Enter the array elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			list.add(arr[i]);
		}
		System.out.println(list);
		
		int temp=0;
		System.out.println("enter the element to be search");
		int s=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
				System.out.println("Index of : "+i);
				temp=1;
				break;
			}
			else
			{
				temp=0;
			}
		}
		if(temp==1)
		{
			System.out.println("The element is presented ");
		}
		else
		{
			System.out.println("-1");
		}

	}

}
