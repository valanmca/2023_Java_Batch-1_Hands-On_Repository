package com.dharshu.ass;

import java.util.Scanner;

public class Assignement3_2 {

	public static void main(String[] args) {
		int n,search,flag=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements in an array");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the  elements in an array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the  elements to search");
		search=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==search) {
				System.out.println("Element "+search+" found at "+i+" position");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The  elements is not found");
		}
	}

}
