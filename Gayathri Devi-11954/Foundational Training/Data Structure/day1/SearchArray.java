package com.gayathri.day1;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i;
		int arr[] = new int[5];
		boolean bool = false;
		
		
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
		
		System.out.println("\nWhich element to be search? : ");
		int search = sc.nextInt();
		for(i=0; i<arr.length; i++)
		{
			if(search == arr[i])
			{	bool = true;
				System.out.println("Search element index : " +i);
				break;
			}
		}
		if(bool==false)
		{
			
			System.out.println("-1");
		}
	}

}
