package com.dharshu.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearchLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element :");
		int list_size=sc.nextInt();
		//inserting the element 
		System.out.println("Enter the "+list_size+"of the element:");
		for(int i=0;i<list_size;i++) {
			int num1=sc.nextInt();
			list.add(num1);
		}
		
		System.out.println("The elements are:"+list);
		
		System.out.println("\nEnter the element to be search:");
		
		int key=sc.nextInt();
		
		int first=0;
		int last=list.size()-1;
		int mid;
		
		boolean isPresent=false;
		while(first<=last) {
			mid=(first+last)/2;
			if(key<list.get(mid)) {
				
				last=mid-1;
				
			} if(key>list.get(mid)) {
				first=mid+1;
				
				
				}
			 if(key==list.get(mid)){
				System.out.println("The element found in the index:"+mid);
				isPresent=true;
				break;
			}
		}	
			if(isPresent==false)	
				System.out.println("The element is not found!!");
		


	}

}
