package com.dharshu.test;

public class Arrayexample {

	public static void main(String[] args) {
		//array element start with index 0
		//1st way of array declaration.
		int arr[]= {1,2,3,4,5};
		//arr[] because array is a object
		//during runtime it allocate the memory
		
		System.out.println("Third Element:"+arr[2]);//displaying the element
		
		arr[2]=23;//updating or modifying the element
		
		System.out.println("After updation:"+arr[2]);
		
		System.out.println("Array elements are:");
		for(int i=0;i<arr.length;i++) {
		//length is used to find the length of the array in runtime
		System.out.println(arr[i]);
		//System.out.println("The length of a array:",+arr[i]);
		}
	}

}
