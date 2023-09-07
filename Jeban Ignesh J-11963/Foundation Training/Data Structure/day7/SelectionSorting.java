package com.jeban.day7;
import java.util.Scanner;


public class SelectionSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of array:");
		int no=sc.nextInt();
		int arr[]=new int [no];
		System.out.println("Enter the array values:");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<arr.length; i++) {
			int minIndex=i;
			for(int j=i+1; j<arr.length; i++)
			{
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		

	}

}
