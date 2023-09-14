package com.dharshu.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkBubbleSort {

	public static void main(String[] args) {
		//LinkedList<Integer> list=new LinkedList <Integer>();
		ArrayList<Integer> list=new ArrayList <Integer>();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the list :");
		int list_size=sc.nextInt();
		//inserting the element 
		System.out.println("Enter the " + list_size + " of the element:");
		for(int i=0;i<list_size;i++) {
			int num1=sc.nextInt();
			list.add(num1);
		}
		
		System.out.println("The elements are:"+list);
		int temp;
		
		System.out.println("The Ascending Bubble sort");
		for(int i=0;i<list_size;i++) {
			for(int j=i+1;j<list_size;j++) {
				if(list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i,list.get(j));//replace r update the value.
					list.set(j,temp);
					
				}
			}System.out.print(" "+list.get(i));
		}		
		
		System.out.println("\n\nThe Descending Bubble sort");
		for(int i=0;i<list_size;i++) {
			for(int j=i+1;j<list_size;j++) {
				if(list.get(i)<list.get(j)) {
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					
				}
			}System.out.print(" "+list.get(i));
		}		

	}

}
