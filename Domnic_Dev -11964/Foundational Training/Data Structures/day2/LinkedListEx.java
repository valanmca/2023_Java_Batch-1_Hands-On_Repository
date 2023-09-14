package com.domnic.day2;
import java.util.LinkedList;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Java");
		list.add("Data Structure");
		System.out.println(list);
		System.out.println();
		list.add(1,"Bye");
		System.out.println("Size :"+list.size());
		System.out.println("Elements :"+list);
		System.out.println();
		list.set(2,"LinkedList");
		System.out.println("Size :"+list.size());
		System.out.println("Elements :"+list);
		System.out.println();
		
		list.remove(0);
		System.out.println("Size :"+list.size());
		System.out.println("Elements :"+list);
		System.out.println();
		
		list.set(list.size()-1, null);
		System.out.println("Elements :"+list);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.println("Elements in the LinkedList are :"+list.get(i));
		}
		

	}

}
