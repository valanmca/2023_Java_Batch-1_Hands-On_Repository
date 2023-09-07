package com.madhan.day06;
import java.util.Arrays;
import java.util.Scanner;


public class BinarysearchArray {

	public static void main(String[] args) {
		
		int arr[]= {10,50,30,40,20,60};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("Enter the element to search:");
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		System.out.println(mid);
		boolean isPresent=false;
		while(left<=right)
		{
			if(arr[mid]==search)
			{
				System.out.println("Element is present at index:"+ mid);
				isPresent=true;
				break;
			}
			else if(arr[mid]>search)
			{
				right=mid-1;
				mid=(left+right)/2;		
			}
			else
			{
				left=mid+1;
				mid=(left+right)/2;	
			}
		}
		
		if(isPresent==false)
		{
			System.out.println("Element is not present");
		}
	

	}

}
