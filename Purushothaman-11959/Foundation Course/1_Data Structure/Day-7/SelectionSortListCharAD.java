package com.purushoth.day7;

import java.util.LinkedList;
import java.util.Scanner;

public class SelectionSortListCharAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list=new LinkedList<Character>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the list: ");
		int size=sc.nextInt();
		System.out.println("Enter the values of list: ");
		for (int i=0;i<size;i++) {
			list.add(sc.next().charAt(0));
		}
		System.out.println(list);
		
		for(int i=0;i<size;i++) {
			int min=i;
			for(int j=i;j<size;j++) {
				if(list.get(min)>list.get(j)) {
				min=j;
			}
			}
		
		char k=list.get(min);
		char temp=list.get(i);
		list.set(i,k);
		list.set(min,temp);
		}
		System.out.println("The list is: "+list);

	}

}//Selection sort using linkedlist in ascending order in character.
