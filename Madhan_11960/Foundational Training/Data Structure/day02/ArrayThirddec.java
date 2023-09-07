package com.madhan.day02;

public class ArrayThirddec {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
     System.out.println("Sum of digits:"+sum);
	}

}
