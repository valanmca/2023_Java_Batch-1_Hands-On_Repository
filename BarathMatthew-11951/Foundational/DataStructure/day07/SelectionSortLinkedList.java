package com.matthew.day07;

import java.util.Scanner;
import java.util.LinkedList;

public class SelectionSortLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the list : ");
		int length = sc.nextInt();
		System.out.println("Enter the names  :");
		for(int i = 0;i<length;i++) {
			list.add(sc.next());
		}
		for(int i = 0; i<list.size();i++) {
			int min = i;
			for (int j = i;j<list.size();j++) {
				if (list.get(min).compareTo(list.get(j)) >0) {
					min = j;
				}
			}
			String temp = list.get(i);
			list.set(i,list.get(min));
			list.set(min, temp);
		}
		System.out.println(list);
	}

}
