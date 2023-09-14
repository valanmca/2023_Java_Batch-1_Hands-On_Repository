package com.mahesh.ds_day7;

public class Bubble_Sort {

	public static void main(String[] args)
	{
		int arr[] = {1,4,2,8,5,9};
		int temp;
		
		System.out.print("input:\n{ ");
		for(int index_first =0 ;index_first<arr.length;index_first++)
		{
		System.out.print(arr[index_first]+" ");
		}
		System.out.print(" }");
		
		for(int index_first =0 ;index_first<arr.length;index_first++)
		{
			for(int index_second =index_first ;index_second<arr.length;index_second++)
			{
				if(arr[index_first]>arr[index_second]) 
				{	
				temp = arr[index_first];
				arr[index_first]= arr[index_second];
				arr[index_second] = temp;
				}
			}
			
		}
		
		System.out.print("\noutput:\n{ ");
		for(int index_first =0 ;index_first<arr.length;index_first++)
		{
		System.out.print(arr[index_first]+" ");
		}
		System.out.print(" }");
}
}
