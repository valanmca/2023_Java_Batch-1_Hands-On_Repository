package com.shiva.day06;

//Binary Search Algorithm (Sorted Array - Ascending)

import java.util.Scanner;
import java.util.ArrayList;

public class SearchMidElement {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Enter the Elements to be searched ");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		
		int beg=0;
		int end=arr.length-1;
		int mid=(beg+end)/2;
		
		boolean isPresent=false;
		while(beg<=end)
		{
			if(arr[mid]==value)
			{
				System.out.println("Element is present in the index : "+mid+" - "+arr[mid]);
				isPresent=true;
				break;
			}
			else if(arr[mid]>value)
			{
				end=mid-1;
				mid=(beg+end)/2;
				
			}
			else
			{
				beg=mid+1;
				mid=(beg+end)/2;
				
			}
		}
		if(isPresent==false)
		{
			System.out.println("The Element is not present");
		}
	}

}
