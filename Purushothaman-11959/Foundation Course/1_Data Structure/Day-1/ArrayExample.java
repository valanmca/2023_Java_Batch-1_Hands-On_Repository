package com.purushoth.day1;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("Value of: "+arr[4]);//To show
		arr[4]=80;//To modify
		System.out.println("Modified: "+arr[4]);
		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
				

	}

}
