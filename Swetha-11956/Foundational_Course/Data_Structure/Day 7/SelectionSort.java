package com.swetha.day7;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		//Selection sort 
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter the number of elements");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			int x=sc.nextInt();
			list.add(x);
			
		}
		System.out.println("The list elements are : "+list);
		int temp,i,j;
		for( i=0;i<size;i++) {
			int min=i;
			for( j=i+1;j<size;j++) {
				if(list.get(min)>list.get(j)) {
					min=j;
					
				}
			}
			temp=list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		System.out.println(list);

	}

}
