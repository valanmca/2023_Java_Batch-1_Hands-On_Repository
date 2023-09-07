package com.dharshu.test;

import java.util.Scanner;

public class javaarray {

	public static void main(String[] args) {
		int arr[]=new int [5];//new is a keyword,runtime memory allocation
		//array declaration
		
		System.out.println("Initial value:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("enter"+arr.length+"value");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();//array initialize the array value by the user in runtime
        //nextInt,nextFloat... it is predefined method in scanner class
	}
		System.out.println("New array element:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);//display the array element after the user given the input
		}
		System.out.println("Ascending order");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(" "+arr[i]);
		}
		System.out.println("Descending  order");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(" "+arr[i]);
		}
			}
	}
