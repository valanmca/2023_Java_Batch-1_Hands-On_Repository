package com.shiva.day17;

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment03 {

	public static void main(String[] args) 
	{
		ArrayList<Integer>list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			list.add(arr[i]);
		}
		System.out.println(list);
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of the array : "+sum);
		
		int avg=sum/n;
		System.out.println("The avg of the array : "+avg);
		
		System.out.println("Enter the element to be search ");
		int s=sc.nextInt();
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==s)
			{
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
			System.out.println("The element is present");
		}
		else
		{
			System.out.println("The element is not present");
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]!=0)
			{
				arr[i]=arr[i]/10;
				count++;
			}
		}
		System.out.println("No of elements in the array: "+count);
	}
		

}
