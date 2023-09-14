package com.dharshu.ass;

import java.util.Scanner;

public class Assignment3_1 {

	public static void main(String[] args) {
		int n,sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of element in an array");
		n=sc.nextInt();
		
		int a[]=new int [n];  //Array declaration
		
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("The sum of array is:"+sum);
		
		avg=sum/n;
		System.out.println("The Average of an array is:"+avg);
	}

}
