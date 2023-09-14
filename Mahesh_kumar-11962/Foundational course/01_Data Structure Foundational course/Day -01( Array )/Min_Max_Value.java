package com.mahesh.ds_day1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Min_Max_Value {

	public static void main(String[] args) {
		System.out.println("Find the Min & Max elements");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int arr_size=sc.nextInt();
		int array[] = new int[arr_size];
		int Max=0;int Min= array.length;
		System.out.print("Enter array element :");
	
		for(int index =0;index<array.length;index++)
		{
		    array[index]=sc.nextInt();	
		}
		
		System.out.println("The array elements : ");
		for(int index =0;index<array.length;index++)
		{
			System.out.print("\t"+array[index]) ;
			if(Max<array[index])
			{
			Max = array[index];	
			}
			
			
			if(Min>array[index])
			{
				Min = array[index];
			}
		}	
		System.out.println("\nMin value is :"+Min);
		System.out.println("\nMax value is :"+Max);
		}	

	}

