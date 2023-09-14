package com.mahesh.ds_day1;
import java.util.Scanner;
public class Array_Search {
	
	public static void main(String[] args) {
	
		int arr_size;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the Array :");
		arr_size=sc.nextInt();
		
		int array[] = new int[arr_size];
		System.out.println("Enter the array elements one by one : ");
		for(int index =0;index<array.length;index++)
		{
		    array[index]=sc.nextInt();	
		}
		
		System.out.println("The array elements : ");
		for(int index =0;index<array.length;index++)
		{
			System.out.print("\t"+array[index]) ;	
		}
		
		System.out.println("\n\nEnter your search element : ");
		int search =sc.nextInt();
		boolean flag=false;
		for(int index =0;index<array.length;index++)
		{	
		
		if(array[index]==search)
		{
		   System.out.println("Result : 1");
		   flag = true;
		   break;
		}

	}
		if(flag==false)
		{
			System.out.println("Result : -1");	
		}
	}
	}

