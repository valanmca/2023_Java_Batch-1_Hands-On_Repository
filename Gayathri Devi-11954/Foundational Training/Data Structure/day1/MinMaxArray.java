package com.gayathri.day1;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		int arr[] = new int[5];
		int max=0;
		int min=0;
		
		
		System.out.println("Enter array elements......");
		for(i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nThe array elements......");
		for(i=0; i<arr.length; i++)
		{
			System.out.print("  "+arr[i]);
		}
		
		System.out.println("\nMaximum element in the array : ");
		for(i=0 ; i<arr.length; i++)
			{
				for(j=i+1; j<arr.length ; j++ ) {
					if(arr[i]>arr[j])
					{
						max = arr[i];
						arr[i] = arr[j];
						arr[j] = max;
					}					
				}//System.out.println(arr[i]);
						
			}System.out.println(max);
			System.out.println("\nMinimum element in the array : ");
			for(i=0 ; i<arr.length; i++)
			{
				for(j=i+1 ; j<arr.length ; j++ ) {
					if(arr[i]<arr[j])
					{
						min = arr[i];
						arr[i] = arr[j];
						arr[j] = min;
					}					
				}
						
			}System.out.println(min);
		}
		
	}
