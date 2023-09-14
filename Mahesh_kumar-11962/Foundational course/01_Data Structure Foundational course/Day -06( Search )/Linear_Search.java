package com.mahesh.ds_day6;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int search;
		boolean flag = false;
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Linear Searching\n\n");
		System.out.print("Enter 10 elements :");
		for(int index =0;index<arr.length;index++)
		{
			arr[index]=ob.nextInt();
			
		}
		for(int index =0;index<arr.length;index++)
		{
			//arr[index]=ob.nextInt();
			System.out.print(arr[index]+" ");
			
		}
	char input;
	do
	{
		
	
		System.out.println("\nEnter your search element : ");
		search = ob.nextInt();
		for(int index =0;index<arr.length;index++)
		{
			if(search==arr[index])
			{
				flag = true;
				//System.out.print("element is found");
			}
			else
			{
				flag = false;
			//	System.out.print("element is found");
			}
			//(flag)==true?System.out.print("element is found");:System.out.print("element is found");
		}
		if(flag == true)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
		System.out.print("Do you want continue (press y to continue) : ");
		input=ob.next().charAt(0);
	}while(input=='y');
	
	}

}

