
//Minimum Max value
package com.jeyavel.day1;
import java.util.Scanner;
public class arraypratice2 {
	public static void main (String []args) {
		
		int array[] = new int[5];
		System.out.println("Minimum max Value");
		System.out.println("enter the array elements");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
			for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();
		}
				
		for(int i=0;i<array.length;i++) {
		int max = 0;
	    int min = array[0];
		for(i=0;i<array.length;i++)
		{
		if(array[i]>max) 
		{
			
			max=array[i];
			
		    }
		if (array[i]<min)
		{
			min=array[i];
      	}
		}
		System.out.println("Min Value " + min);
		System.out.println("max value "+ max);
		}
	}}

