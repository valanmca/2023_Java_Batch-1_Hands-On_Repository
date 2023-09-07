package com.gayathri.day6;

import java.util.Scanner;

public class BinarySearchArray {

	public static void main(String[] args) {

		int arr[] = {10,12,24,29,39,40,51,56,69};
		
		System.out.println("The initial array elements are....");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		
		System.out.print("\nEnter the element to search : ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		
		int first=0;
		int last = arr.length-1;
		int middle;
		boolean isPresent =false;
		while(first<=last){
			middle = (first+last)/2;
			if(search<arr[middle])//go left
				{
					last = middle-1;
				}
			else if(search>arr[middle])//go right
				{					
					first = middle+1;
				}	
			else if(arr[middle]==search) {
				System.out.print("\nThe searching element found in the index of : "+middle);
				isPresent = true;
			break;}
			
			//middle = (first+last)/2;
		}
		if(isPresent == false) {
			System.out.print("\nThe searching element not found");
		}
	}

	}
