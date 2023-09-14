package com.jenish.day01;

public class Array_Sample_Ex1 {

	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		System.out.println("Third Element:"+arr[3]);
		arr[3]=444; //updating or modifying the element
		System.out.println("New Element:"+arr[3]);
		
		System.out.println("Array Elements Are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
