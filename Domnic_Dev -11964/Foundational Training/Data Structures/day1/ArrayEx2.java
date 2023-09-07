package com.domnic.day1;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		System.out.println("The array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);        //printing the default values
		}
		System.out.println("Enter " +arr.length+" Values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {        //inserting values from user 
			arr[i]=sc.nextInt();
		}
		System.out.println("The New array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);          //printing the updated values
		}

	}

}
