package com.aravind.day6;
import java.util.Scanner;

public class linearSearchArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the value of array");
		int arr[]=new int [size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("array elements =");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("enter the search element");
		int search=sc.nextInt();
		
		boolean ispresent=false;
		for(int i=0;i<size;i++)
		{
			if(search==arr[i])
			{
				System.out.println("element present at index "+i);
				ispresent=true;
				break;
			}
			else
			{
				ispresent=false;
			}
		}
		
		if(ispresent==false)
		{
			System.out.println("element not present");
		}
		
				
		

	}

}
