package com.aravind.day7;

import java.util.Scanner;

public class SelectionSortArray {
      public static void main(String arg[])
      {
    	  Scanner sc = new Scanner(System.in);
  		System.out.println("enter the size");
  		int size = sc.nextInt();
  		int arr[] = new int[size];
  		
  		for (int i = 0; i < arr.length; i++) {
  			arr[i] = sc.nextInt();
  		}
  		
  		
  		for(int i=0;i<size-1;i++)
  		{
  			int minIndex=i;
  			
  			for(int j=i+1;j<size;j++)
  			{
  				if(arr[minIndex]>arr[j])
  				{
  					minIndex=j;
  					
  				}
  				
  				
  			}
  			int temp=arr[i];
  			arr[i]=arr[minIndex];
  			arr[minIndex]=temp;
  		}
  		for (int i = 0; i < arr.length; i++) {
  			System.out.println(arr[i]);
  		}
  		
	}

}
