package com.gayathri.day2;


public class SumOfArray {

	public static void main(String[] args) {
		
		//3rdsyntax
		
		int arr[] = new int[] {100,100,100};
		int ans=0;
		
		for(int i=0;i<arr.length;i++)
		{
			 ans = ans + arr[i];
		}		
		System.out.println("The sum of array : " +ans);
		

	}

}
