package com.jeban.day6;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryLinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		System.out.println(list);
		int left=0;
		int right=list.size()-1;
		int mid=(left+right)/2;
//		System.out.println(mid);
		
		Scanner sc=new Scanner (System.in);
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
