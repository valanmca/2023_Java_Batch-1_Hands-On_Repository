package com.shaji.Day01;

import java.util.Scanner;

public class Search1 {

	public static void main(String[] args) { // Searching the element using Array
		int arr[] = {10, 20, 30, 40, 50};
		int flag=0;
		System.out.println("Enter the value to search ");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == search){
				System.out.println(i);
				flag=1;
				System.out.println("The value is Present...");
				break;
			}
		}
		if(flag!=1) {
			System.out.println("-1");
			System.out.println("The value is Absent...");
		}
	}
}
			
		


