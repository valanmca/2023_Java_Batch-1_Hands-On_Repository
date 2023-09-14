
//Array Elements
package com.jeyavel.day1;
import java.util.Scanner;

public class arrayele {

	public static void main(String[] args) {
         
		float arr[]= new float[10];
		
		System.out.println("Initial array elements are  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("enter " + arr.length + " values");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for( int i=0;i< arr.length;i++) {
			arr[i]= sc.nextFloat();
		}
		
		System.out.println("New array elements are  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
				

	}

}
