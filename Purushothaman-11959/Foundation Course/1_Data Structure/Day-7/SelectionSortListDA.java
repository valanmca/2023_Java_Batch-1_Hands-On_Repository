package com.purushoth.day7;

import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSortListDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the list: ");
		int size=sc.nextInt();
		System.out.println("Enter the values of list: ");
		for (int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list:"+list);
		for(int i=0;i<size;i++) {
			int max=i;
			for(int j=i+1;j<size;j++) {
				if(list.get(max)<list.get(j)) {
					max=j;
				}
			}
			int k=list.get(max);
			int temp=list.get(i);
			list.set(i,k);
			list.set(max,temp);
		}
		System.out.println("The sorted values in descending: "+list);

	}

}//Selection sort using linked list in descending order.
