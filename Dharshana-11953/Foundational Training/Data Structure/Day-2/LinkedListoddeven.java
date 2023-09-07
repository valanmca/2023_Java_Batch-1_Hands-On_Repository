package com.dharshu.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListoddeven {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList <Integer>();
		LinkedList<Integer> oddlist=new LinkedList <Integer>();
		LinkedList<Integer> evenlist=new LinkedList <Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many element :");
		int oddeven=sc.nextInt();
		System.out.println("Enter the "+oddeven+" of the element:");
		for(int i=0;i<oddeven;i++) {
			int num1=sc.nextInt();
			list.add(num1);
		}
		
		System.out.println("The elements are:"+list);
		
		for(int i=0;i<oddeven;i++) {
			if(list.get(i)%2==0)
			{
				evenlist.add(list.get(i));
			}
			else {
				oddlist.add(list.get(i));
			}
		}
		System.out.println("The odd numbers are:"+oddlist);
		System.out.println("The even numbers are:"+evenlist);

	}

}
