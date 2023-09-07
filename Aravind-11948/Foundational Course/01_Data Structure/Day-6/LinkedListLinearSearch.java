package com.aravind.day6;// linear search in String linkedList

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListLinearSearch {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the list elements are");
		for (int i = 0; i < size; i++) {
			list.add(sc.next());
		}
		
		System.out.println(list);
		System.out.println("enter the string  to be search");
		String search=sc.next();
		
		boolean ispresent = false;
		for (int i = 0; i < size; i++) {
			if (search.equals(list.get(i)))
				{
				System.out.println("element present in the index=" + i);
				ispresent = true;
				break;
			}
		}
		if (ispresent == false) {
			System.out.println("element not present");
		}

	}

}
