//Linear Search using Array

package com.jeyandhan.day06;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the "+ arr.length+" Elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("The elements in the array are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

		
		System.out.println("Enter the value to be search");
		int search = sc.nextInt();
		boolean isPresent = false;
		for(int i=0;i<5;i++) {
			if(search==arr[i]) {
				System.out.println("Element Present in the index: "+i);
				isPresent = true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println("Not present");
		}
		
	}

}
