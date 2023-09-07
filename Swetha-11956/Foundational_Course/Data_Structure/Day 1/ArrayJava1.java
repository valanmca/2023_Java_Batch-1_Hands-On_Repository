//Getting array input from user
package com.swetha.day1;
import java.util.Scanner;

public class ArrayJava1 {

	public static void main(String[] args)
	{
		int arr[]=new int[5];  //Allocating memory during runtime
		//Printing the initial array elements
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter "+arr.length +" values");
		
		//getting input from user
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();   //For getting float input use nextFloat,and nextBoolean for boolean input ,index will be int
		}
		
		//Printing new array elements
		System.out.println("New array elements are ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}

	}

}
