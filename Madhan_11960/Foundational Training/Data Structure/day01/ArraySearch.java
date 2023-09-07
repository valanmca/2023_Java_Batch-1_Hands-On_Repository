package com.madhan.day01;
import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		int arr[]=new int[10];
		
		System.out.println("Enter the 10 Elements: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
      System.out.println("Enter the searching element:");
      int n=sc.nextInt();
     /* int count=1; */  boolean isPresent=false;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==n)
    	  {
    		  System.out.println(i);
    		  /*count=0;*/ isPresent=true;
    		  break;
    	  }
      }
    	  if(isPresent==false)
    	  {
    		  System.out.println("Element Not present");
    	  }
      
      
    	  
      
	}

}
