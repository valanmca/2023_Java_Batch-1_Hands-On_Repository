package com.jeyavel.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearchinLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Mahesh");
		list.add("Jeyanthan");
		list.add("Raj");
		list.add("Bazki");
		list.add("Umapathy");
		list.add("Bala");
		list.add("Harrish");
		System.out.println("list Elements Are ->"+list );
		@SuppressWarnings("resource")
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the String to Find");
		String str = sc.next();
		
		boolean flag = false;
		for(int i=0;i<list.size();i++) {
			if(str.equals(list.get(i))) {
				System.out.println("String is Present-> " + (i+1) + " Position");
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("String is Not Present");
		}
	}

}
