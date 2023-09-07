package com.jenish.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//BinarySearch Algorithm-ArrayList
public class BinarySearch_Algorithm_Arr_Sort_Sample_Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		int array[]= {11,17,12,13,15,16,14,18,19,20};
		Arrays.sort(array);
		System.out.println("  Sorting:  ");
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]+" ");
		}
		System.out.println("Enter the Value:");
		int Find = sc.nextInt();
		int up=0;
		int dw=array.length-1;
		int mid=(up+dw)/2;	
		
		boolean  isPresent=false;
		while (up<=dw) {
			if(array[mid]==Find) {
				System.out.println("Element Present in the index:" +mid);
				isPresent=true;
				break;
				
				}
			
			if (array[mid]<Find) {
				up=mid+1;
				mid=(up+dw)/2;
			}
			if(array[mid]>Find) {
				dw=mid-1;
				mid=(up+dw)/2;
			}
			
		}
		if(isPresent==false)
			System.out.println("Element not Present");
		sc.close();

	

	}

}
