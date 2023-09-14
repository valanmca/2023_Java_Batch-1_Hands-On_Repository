package com.swetha.day7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class BubbleSortLinkList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			int x=sc.nextInt();
			list.add(x);
			
		}
		System.out.println("The list elements are : "+list);
		
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j, temp);
					
					
				}
			}
		}
		System.out.println("The list elements after sorted are : "+list);

	}




	}


