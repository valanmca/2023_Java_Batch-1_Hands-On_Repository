package com.shaji.Day01;

public class minmax1 {

	public static void main(String[] args) { // Finding Minimum and Maximum Values
		int arr[] = {30, 50, 20, 10, 40};
		int min = arr[0];
		for(int i=0; i < arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Value is : " + min);
		int max = 0;
		for(int i=0; i < arr.length; i++){
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Value is : " + max);
	}
}