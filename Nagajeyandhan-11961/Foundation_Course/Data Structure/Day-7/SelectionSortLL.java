//selection with linkedlist

package com.jeyandhan.day07;

import java.util.LinkedList;

import java.util.Scanner;

public class SelectionSortLL {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int temp;
		
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter your Elements: ");
		for(int i=0;i<size;i++) {
			int temp1 = sc.nextInt();
			list.add(temp1);
		}
		System.out.println("The Elements in the list are: "+list);
		
		for(int i=0;i<size;i++) {
			int min_index = i;
			for(int j=i+1;j<size;j++) {
				if(list.get(min_index)>list.get(j)) {
					min_index = j;
				}
			}
			
			temp = list.get(i);
			list.set(i,list.get(min_index));
			list.set(min_index,temp);
			
		}
		System.out.println("Sorted list: " + list);

	}

}
