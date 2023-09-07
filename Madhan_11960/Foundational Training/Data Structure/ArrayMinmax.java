package com.madhan.day01;

public class ArrayMinmax {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	int max=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
			
		}
			
	}
	System.out.println("The maximum element is:"+max);
	
	int min=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
			
		}
			
	}
	System.out.println("The minimum element is:"+min);

	}

}
