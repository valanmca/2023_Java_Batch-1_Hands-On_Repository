//min & max value of array
package com.jenish.day01;

import java.util.Scanner;

public class Array_SamplePratice_Ex4 {

	public static void main(String[] args) {
		int array[]=new int[5];
		System.out.println("Enter the array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++){
			array[i]= sc.nextInt();
		}
		int max=0;
		int min=array[0];
		System.out.println("Find the min & max values");
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			if(array[i]<min)
			{
				min=array[i];
		     }
		}
		System.out.println("Max Value is:"+max );
		System.out.println("Min Value is:"+min );
		sc.close();
	}	
}
	
