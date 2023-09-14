package com.jeban.day6;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListSearch3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("apple");
		list.add("banana");
		list.add("cucumber");
		list.add("orange");
		list.add("mango");
		list.add("graphs");
		
		System.out.println("Enter the String:");
		Scanner sc=new Scanner (System.in);
		String j=sc.next();
		
		boolean isPresent=false;
		for(int i=0; i<list.size(); i++) {
			if(j.equals(list.get(i))) {
				System.out.println("Elements present in the list:"+i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false) {
			System.out.println("Element not present");
		}
		
		
		

	}

		

	}


