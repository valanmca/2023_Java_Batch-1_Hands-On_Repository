package com.dharshu.test;

import java.util.Scanner;

public class maxmini {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int max=0;
		int min=0;
		
		System.out.println("Enter the array element:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("The array element:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(" "+arr[i]);
			}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
		}
				System.out.println(" The Maximum number: "+max);
							
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]<arr[j])
						{
							min=arr[i];
							arr[i]=arr[j];
							arr[j]=min;
						}
			}
	}
			System.out.println(" The Minimum number: "+min);
			
}
}
			
		
		
		
	


