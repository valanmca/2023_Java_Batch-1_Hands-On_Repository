package com.domnic.day1;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
	int arr[]=new int[5];
	
	System.out.println("Enter " +arr.length+" Values");
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {        //inserting values from user 
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the value to be find");
	int value=sc.nextInt();
	boolean temp= false;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==value) 
		{
			System.out.println("1");
			temp=true;
		}
	}
			
	
	if(temp==false) {
		System.out.println("-1");
	}

	}
}

