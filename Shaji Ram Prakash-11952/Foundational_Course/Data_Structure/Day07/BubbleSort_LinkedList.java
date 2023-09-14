package com.shaji.Day07;

import java.util.Scanner;
import java.util.LinkedList;

public class BubbleSort_LinkedList {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList<Integer>();
		LinkedList <Integer> list1 = new LinkedList<Integer>();
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("The Size of the List : ");
		int size = sc.nextInt();
		System.out.println("Enter the List Values : ");
		for(int i=0; i<size; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The List Values : " +list);
		
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++) {
				int b = list.get(i);
				int s = list.get(j);
				if(b>s) {
					temp = s;
					list.set(j,b);
					list.set(i,temp);
				}
			}
		}
			
	System.out.println("Bubble Sorted Array in Linked List : ");
	for(int i=0; i<size; i++) {
		list1.add(list.get(i));
}
	System.out.println(list1);
}
}
