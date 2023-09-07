package com.gayathri.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkBubbleSort {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		//ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter list size : ");
		int list_size = sc.nextInt();

		// inserting elements input from user
		System.out.println("\nEnter " + list_size + " elements : ");
		for (int i = 0; i < list_size; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("\nList numbers are : " + list);

		System.out.println("\nAscending Bubble sort");
		int temp;
		for (int i = 0; i < list_size; i++) {
			for (int j = i + 1; j < list_size; j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));// replace r update the value.i=j
					list.set(j, temp);// j=temp
				}
			}
			System.out.print("  " + list.get(i));
		}
		
		System.out.println("\nDescending Bubble sort");
		
		for (int i = 0; i < list_size; i++) {
			for (int j = i + 1; j < list_size; j++) {
				if (list.get(i) < list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));// replace r update the value.i=j
					list.set(j, temp);// j=temp
				}
			}
			System.out.print("  " + list.get(i));
		}
sc.close();
	}

}
