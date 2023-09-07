package com.shiva.day06;

import java.util.Scanner;

//Linear Search Algorithm - Array

public class SearchArray {

	public static void main(String[] args) {
		int arr[]= {10,12,14,16,18,20};
		
		System.out.println("Enter the Elements to be Search: ");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		boolean isPresent = false;
		for(int i=0;i<arr.length; i++)
		{
			if(k==arr[i]) {
				System.out.println("Element present in the index: "+i);
				isPresent = true;
				break;
			}
		}
		
		if(isPresent == false)
		{
			System.out.println("Element is not presented in the index --> "+k);
		}
	}

}
