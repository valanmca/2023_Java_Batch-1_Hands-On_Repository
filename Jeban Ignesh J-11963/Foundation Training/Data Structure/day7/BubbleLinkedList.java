package com.jeban.day7;

import java.util.LinkedList;
import java.util.Scanner;

public class BubbleLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list size:");
		int number = sc.nextInt();
		System.out.println("Enter the list values:");
		for (int i = 0; i < number; i++) {
			list.add(sc.nextInt());

		}
		System.out.println("The list is:" + list);
		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j,temp);
					
					

				}

			}
			
		}
		System.out.println("The arraylist is: ");
		for(int i=0;i<number;i++) {
			list1.add(list.get(i));
		}
		System.out.println(list1);
	}

	}


