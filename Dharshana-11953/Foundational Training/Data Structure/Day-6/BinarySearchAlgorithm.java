package com.dharshu.day6;

import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		
		int numarr[]= {5,10,15,20,25,30,35,40,45};
		System.out.println("The Input Array:");
		for(int i=0;i<numarr.length;i++) 
			System.out.print("  "+numarr[i]);

			System.out.println("\nEnter the element to be search:");
			Scanner sc=new Scanner(System.in);
			int key=sc.nextInt();
			
			int first=0;
			int last=numarr.length-1;
			int mid;
			
			boolean isPresent=false;
			while(first<=last) {
				mid=(first+last)/2;
				if(key<numarr[mid]) {
					
					last=mid-1;
					
				} if(key>numarr[mid]) {
					first=mid+1;
					
					
					}
				 if(key==numarr[mid]){
					System.out.println("The element found in the index:"+mid);
					isPresent=true;
					break;
				}
			}	
				if(isPresent==false)	
					System.out.println("The element is not found!!");
			
			//mid=(first+last)/2;
			
		}
}


