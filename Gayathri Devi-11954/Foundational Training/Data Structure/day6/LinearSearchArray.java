package com.gayathri.day6;

import java.util.Scanner;

public class LinearSearchArray {//by using array

	public static void main(String[] args) {

		int arr[] = {12,34,45,56,67,78,89,90,23};
		
		System.out.println("\nInitial array elements....");
		for (int i = 0; i < arr.length; i++) // length runtime counting the length
		{
			System.out.print(" "+arr[i]);
		}
		
		System.out.println("\n\nEnter the element to search : ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		boolean isPresent = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(search==arr[i]) {
				System.out.println("\nThe search element is present in array index : "+i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false)
			System.out.println("\nThe search element is not present in array");
sc.close();
	}

}
