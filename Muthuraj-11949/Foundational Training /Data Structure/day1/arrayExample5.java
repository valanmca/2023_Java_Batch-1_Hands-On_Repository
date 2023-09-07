package com.muthu.day1;
import java.util.Scanner;
public class arrayExample5 {
	public static void main(String[] args)
	{	
	
		int arr[]={20,50,60,70,80};
		int max= 0,min=arr[1];
		for( int i=0;i<arr.length;i++) 
		{
			if(arr[i]>max) {
			max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min:" +min);
		System.out.println("max:" +max);
	}
}
