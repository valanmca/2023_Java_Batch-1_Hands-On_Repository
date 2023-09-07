package com.matthew.day07;

import java.util.LinkedList;
import java.util.Scanner;

public class BubbleSortLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int num = sc.nextInt();
		System.out.println("Enter the elements of array :");
		for(int i = 0;i<num;i++) {
			list.add(sc.next());
		}
		for (int i = 0;i<num-1;i++) {
			for(int j = i+1;j<num;j++) {
				String a = list.get(i);	
				String b = list.get(j);
				if(a.compareTo(b)>0) {
					String temp = a;
					list.set(i, b);
					list.set(j,temp);
				}
			}
		}
		System.out.println(list);
	}

}
