package com.mahesh.ds_day1;
import java.util.Scanner;
public class Array_Traverse {

	public static void main(String[] args) 
	{
		// initial array values
		
		Scanner sc =new Scanner(System.in);
	
		System.out.print("Enter the size of the array : ");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		for(int i =0;i<array.length;i++)
		{
			System.out.print("| "+array[i]);
		}	
		System.out.print("\nEnter "+size+" values : ");
	
		for(int j=0;j<array.length;j++)
		{
			array[j]=sc.nextInt();
		}
		System.out.print("10 values are: \n");
		for(int j=0;j<array.length;j++)
		{
			System.out.print("arr["+j+"]");
		System.out.print(" : "+array[j]+"\t");	
		}	
	}
}
