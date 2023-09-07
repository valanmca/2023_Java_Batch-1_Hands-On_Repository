package com.shaji.Day07;

import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSort_LinkedList_Asec {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList<Integer>();
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
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(list.get(min)>list.get(j)) {
					min = j;
				}
			}
			temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
			
	System.out.println("Bubble Sorted Array in Linked List : " + list);
	}

}