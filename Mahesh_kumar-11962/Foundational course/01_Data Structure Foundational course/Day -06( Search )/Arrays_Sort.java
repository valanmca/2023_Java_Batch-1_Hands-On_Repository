package com.mahesh.ds_day6;

import java.util.Arrays;

public class Arrays_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 10, 3, 4, 9, 2, 7, 8, -1, 0 };
		System.out.print("Before sorting Array : ");
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.print("\nAfter sorting Array : ");
		for(int i=0;i<9;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
