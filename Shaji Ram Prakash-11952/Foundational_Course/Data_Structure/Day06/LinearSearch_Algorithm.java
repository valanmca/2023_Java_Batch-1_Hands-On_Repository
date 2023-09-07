package com.shaji.Day06;

import java.util.Scanner;
// Linear Search Algorithm - Array

public class LinearSearch_Algorithm {

	public static void main(String[] args) {
		int arr[] = {10, 8, 5, -6, 2, 4, 20, -18};
		
		System.out.println("Enter the element to search : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		sc.close();
		
		boolean isPresent = false;
		for (int i=0; i<arr.length; i++) {
			if(s == arr[i]) {
				System.out.print("Element Present in the index : " + i);
				isPresent=true;
				break;
			}
		}
		
		if(isPresent == false)
			System.out.println("Element is Absent...");
	}

}
