package com.jeban.day6;

import java.util.Scanner;

public class Searching1 {

	public static void main(String[] args) {
		int arr[]= {12,56,34,23,10};
		
		System.out.println("Enter the element to search:");
		Scanner sc=new Scanner (System.in);
		int j=sc.nextInt();
		boolean isPresent=false;
		for(int i=0; i<arr.length; i++) {
			if(j==arr[i]) {
				System.out.println("Element present in the index:"+i);
				isPresent=true;
				break;
				
				
			}
		}

		if(isPresent==false) {
			System.out.println("Element is not present");
		}
	}

}
