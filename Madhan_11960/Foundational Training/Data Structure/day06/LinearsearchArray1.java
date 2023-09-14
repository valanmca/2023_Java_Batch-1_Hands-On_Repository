package com.madhan.day06;
import java.util.Scanner;

public class LinearsearchArray1 {

	public static void main(String[] args) {
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[] =new int[size];
		for(int i=0;i<size;i++)
		{
			int value=sc.nextInt();
			arr[i]=value;
		}
		System.out.println("The array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println( arr[i]);
		}
		System.out.println("Enter the search element");
		int search=sc.nextInt();
		
		
		boolean isPresent=false;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==search)
			{
				System.out.println(" Element is present"+i);
				 isPresent =true;
				 break;
			}
		}
		if(isPresent==false)
		{
			System.out.println("Element is not present");
		}

	}

}
