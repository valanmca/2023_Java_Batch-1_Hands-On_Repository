package com.aravind.day6;
import java.util.Scanner;

public class BinarySearchInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("enter the value to search");
		int searchelement=sc.nextInt();
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;
		
		boolean isPresent = false;
		while (low <= high) {

			if (arr[mid] == searchelement) {
				System.out.println("element present at index " + mid );
				System.out.println( arr[mid]);
				isPresent = true;
				break;
			} else if (arr[mid] > searchelement) {
				high = mid - 1;
				mid = (low + high) / 2;
			}

			else  {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		
		if(isPresent==false)
		{
			System.out.println("not present");		
			}
		

	}

}
