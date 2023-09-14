package com.jeban.day6;

import java.util.Scanner;
import java.util.ArrayList;

public class BinaryArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the list value:");
		int I=sc.nextInt();
		System.out.println("Enter the Values:");
		for(int i=0; i<I; i++) {
			list.add(I);
			
		}
		System.out.println("list");
//		list.add(12);
//		list.add(78);
//		list.add(56);
//		list.add(23);
//		list.add(56);
//		list.add(67);
//		list.add(80);
//		System.out.println(list);
		int left=0;
		int right=list.size()-1;
		int mid=(left+right)/2;
//		System.out.println(mid);
		
//		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the value:");
		int j=sc.nextInt();
		System.out.println("The Value is:"+j);
		
		boolean isPresent = false;
		while (left<= right) {
			if (list.get(mid) == j) {
				System.out.println("Element present in the Index: " + mid);
				isPresent = true;
				break;

			}
			if (list.get(mid) < j) {
				left = mid + 1;
				mid = (left + right) / 2;
			}
			if (list.get(mid) > j) {
				right = mid - 1;
				mid = (left + right) / 2;
			}
		
		
	}
		if(isPresent==false) {
			System.out.println("Element is not present");
		}

	}
		

	}


