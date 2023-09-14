package com.purushoth.day7;

import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSortListStringAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the list: ");
		int size=sc.nextInt();
		System.out.println("Enter the values of list: ");
		for (int i=0;i<size;i++) {
			list.add(sc.next());
		}
		System.out.println("The list is: "+list);
		
		for(int i=0;i<size;i++) {
			int min=i;
			for(int j=i;j<size;j++) {
				if(list.get(min).compareTo(list.get(j))>0) {
					min=j;
				}
			}
			String k=list.get(min);
			String temp=list.get(i);
			list.set(i,k);
			list.set(min,temp);
		}
		System.out.println("The list is: "+list);

	}

}//Selection sort in linked list in ascending order using string.
