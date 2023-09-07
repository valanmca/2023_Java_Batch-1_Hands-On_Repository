package com.jeban.Assignment;
import java.util.Scanner;
import java.util.LinkedList;

public class Problem4 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Size of the List:");
		int x=sc.nextInt();
		System.out.println("Enter the list:"+x);
		for(int i=0; i<x; i++) {
			list.add(sc.nextInt());
			
		}
		System.out.println("List is:"+list);
		System.out.println("Search Element:");;
		int search=sc.nextInt();
		int count=0;
		for(int i=0; i<x; i++) {
			if(list.get(i)==search) {
				count++;
				System.out.println("The element is found:"+i);
			}
		}
		if(count==0) {
			System.out.println("The element is not found -1");
		}

	}

}
