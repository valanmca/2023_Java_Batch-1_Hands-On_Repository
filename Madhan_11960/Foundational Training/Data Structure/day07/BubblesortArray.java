package com.madhan.day07;
import java.util.Scanner;

public class BubblesortArray {

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
		
		for(int i=0;i<size;i++) //This is for how many times to iterate the loop
		{
			for(int j=0;j<size-1;j++) //here it compare the elements
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
          System.out.println("After Bubble sort occurs:");
          for(int i : arr)
          {
        	  System.out.println(i);
          }
	}

}
