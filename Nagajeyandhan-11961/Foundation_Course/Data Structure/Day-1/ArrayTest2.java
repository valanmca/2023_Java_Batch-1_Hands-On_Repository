// Minimum and Maximum Value in an array

package com.jeyandhan.day01;

import java.util.*;

public class ArrayTest2 {

	public static void main(String[] args) {
		int arr[]=new int[3];
		int max=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i]; 
			}
		}
		System.out.println("Maximum vlue: "+max);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i]; 
			}
		}
		System.out.println("Minimum Value:" +min);
	}

	}

