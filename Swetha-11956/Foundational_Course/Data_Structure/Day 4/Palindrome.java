package com.swetha.day4;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Palindrome {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		list.add(1);
		list.add(8);
		list.add(17);
		list.add(9);
		list.add(17);
		list.add(8);
		list.add(3);
		
		int size=list.size();
		
		System.out.println("The Original list is "+ list);
		
		for(int i=size-1;i>=0;i--) {
			list1.add(list.get(i));
		}
		System.out.println("The reversed list is "+list1);
		
		int flag=0;
		for(int i=0;i<size;i++) {
			if(!(list.get(i)==list1.get(i))) {
				System.out.println("Not a Palindrome");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Palindrome");
		}
		
		

	}

}
