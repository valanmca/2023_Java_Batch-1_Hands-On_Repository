package com.swetha.day2;

import java.util.LinkedList;

public class StringLinkList {

	public static void main(String[] args) {
          LinkedList<String> list=new LinkedList<String>();
		
		//Adding the elements to the linked list
		list.add("C");
		list.add("C++");
		list.add("JAVA");
		list.add("PHP");
		System.out.println("The list elements are :      "+list);
		
		//Inserting an element in the list at index 1
		list.add(1,"PYTHON");
		System.out.println("Inserting an element in the list at index 1 :      "+ list);
		
		//Update the element 100 at index 1
		list.set(1, ".NET");
		System.out.println("After Updating the element 100 at index :      "+list);
		
		//Remove elemnent at index 1
		list.remove(1);
		System.out.println("After removing an element from index 1 :    "+list);
		
		//Printing the size of list
		System.out.println("The size of the list is     "+list.size());
		
		System.out.println("The list elements are :");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}




	}


