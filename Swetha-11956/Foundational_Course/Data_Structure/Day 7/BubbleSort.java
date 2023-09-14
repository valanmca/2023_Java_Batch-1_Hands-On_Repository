package com.swetha.day7;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= {10,40,20,60,30};
		System.out.println("The  array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("The sorted array elements in ascending order are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(+arr[i]);
		}
		
		
		
	}

}
