package com.shaji.Day02;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		//Adding Elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list); //[10, 20, 30, 40]
		
		list.add(1,24); // Inserting between with index value
		System.out.println(list); //[10, 24, 20, 30, 40]
		
		list.set(1, 100); // Update
		System.out.println(list); //[10, 100, 20, 30, 40]
		
		list.remove(1); // Removing using index value
		System.out.println(list); //[10, 20, 30, 40]
		
		System.out.println("Size is " + list.size()); // Size is 4
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));// Result on vertical way...
		}
		
		// Linked List using String ...!
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		//Adding Elements
		list1.add("C");
		list1.add("C++");
		list1.add("Java");
		list1.add("Python");
		System.out.println(list1); //[10, 20, 30, 40]
		
		list1.add(1,"PHP"); // Inserting between with index value
		System.out.println(list1); //[10, 24, 20, 30, 40]
		
		list1.set(1,"HTML&CSS"); // Update
		System.out.println(list1); //[10, 100, 20, 30, 40]
		
		list1.remove(1); // Removing using index value
		System.out.println(list1); //[10, 20, 30, 40]
		
		System.out.println("Size is " + list1.size()); // Size is 4
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));// Result on vertical way...
		}
	}

}
