package com.jenish.day07;

import java.util.Scanner;

public class BubbleSort_Sample_Descending_Ex2 {

	public static void main(String[] args) {
		int temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the values:");
		int arr_size=sc.nextInt();
	    int arr[]=new int[arr_size];
	    System.out.println("enter the " +arr_size+ "elements");
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=sc.nextInt();
	    }
		System.out.println("Initial Elements are:");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr.length-1;j++) {
	    		if(arr[j]<arr[j+1]) {
	    			temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    }
	    System.out.println("Sorted Array");
	    for(int i=0; i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	    sc.close();

	}

}
