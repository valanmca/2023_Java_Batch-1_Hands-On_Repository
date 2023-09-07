package com.aravind.day6;
import java.util.*;

public class TryBinaryUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int arr[]=new int [size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.print(" array= ");
		for(int i=0;i<size;i++)
		{
		  System.out.print(arr[i]);//printing 
		}
		
		
		//sorting
		
		
		int temp;
		for(int i=0;i<size-1;i++) // [20, 10, 30]
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("reverse array=");
		
		for(int i=0;i<size;i++)
		{
		  System.out.print(arr[i]);//printing 
		}
		System.out.println();
		System.out.println("enter the search element");
		int searchelement=sc.nextInt();
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;
		
		boolean isPresent = false;
		while (low <= high) {

			if (arr[mid] == searchelement) {
				System.out.println("element present at index " + mid );
				System.out.println( arr[mid]);
				isPresent = true;
				break;
			} else if (arr[mid] > searchelement) {
				high = mid - 1;
				mid = (low + high) / 2;
			}

			else  {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		
		if(isPresent==false)
		{
			System.out.println("not present");		
			}
		


		
		
		
		
		
		

	}

}
