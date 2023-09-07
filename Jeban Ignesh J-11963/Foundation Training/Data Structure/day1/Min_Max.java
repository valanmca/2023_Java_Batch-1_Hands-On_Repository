package com.jeban.day1;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 45, 89, 34, 56, 67 };
		int max=0;
		for ( int i=0; i<arr.length; i++) {
			if (max<arr[i])
				max=arr[i];
			System.out.println(arr[i]);
			
			
		}
		System.out.println(max);
}
}