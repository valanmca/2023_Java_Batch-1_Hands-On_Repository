package com.naveen.day1;

public class ArrayEx01 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int arr1[] = new int[0];
		
		System.out.println("The Length of array 1 is :" + arr1.length);				
		System.out.println("Third Element : "+arr[2]); //Printing the Element
		
		arr[2] = 33; //Updating the Element
		
		System.out.println("New Third Element :"+arr[2]);
		
		System.out.println("Array Elements are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
