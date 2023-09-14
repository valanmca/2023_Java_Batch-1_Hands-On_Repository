package com.swetha.day1;
import java.util.Arrays;  //For using sort function
import java.util.Scanner;
public class ArrMinMax {
	public static void main(String[] args) {
		int arr[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum value is " + min);
		System.out.println("Maximum value is " + max);
		
		//Sorting array using sort
		System.out.println("Sorted array : ");
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
      
}
}
