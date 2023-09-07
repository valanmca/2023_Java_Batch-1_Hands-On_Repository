//Add, remove,update,traverse elements in LinkedList(String)

package com.jeyandhan.day02;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		System.out.println(list);
		
		list.add("Tamil"); //adding elements
		list.add("English");
		list.add("Maths");
		list.add("Science");
		list.add("Social");
		System.out.println("The elements in the list are: "+list);// display  elements in the list
		
		list.add(3,"Biology"); //Inserting element with index
		System.out.println("The elements in the list are: "+list);
		
		list.set(2, "Mathematics"); //updating an element
		System.out.println("The elements in the list after updating: "+list);
		
		list.remove(3); //removing an element
		System.out.println("The elements in the list after removing: "+list);
		
		System.out.println("The Elements in the list are: "); 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //Printing elements one by one
		}
	}

	}

