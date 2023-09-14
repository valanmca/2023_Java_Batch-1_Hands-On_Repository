package com.dharshu.day6;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		
		System.out.println("The elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter the element to Search:");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		
		boolean isPresent=false;
		for(int i=0;i<arr.length;i++) {
			if(d==arr[i]) {
				System.out.println("The Search element is present in the index:"+i);
				isPresent=true;
				break;
			}
		}
		
		if(isPresent==false)
			System.out.println("The element is not Present!!!");
	}                                                        
	
}
