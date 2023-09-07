package com.gayathri.day2;

import java.util.LinkedList;

public class LinklistPro1 {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList <Integer> ();
			//LinkedList <String> list = new LinkedList <String> ();
		//linked list also start index with 0

		//adding elements at the end 
		list.add(10);
		list.add(20);
		list.add(30);
			//list.add("Gayathri");
		
		System.out.println("Initial adding : "+list);//[10,20,30]
		
		//adding value in specific index
		list.add(2,40);
		System.out.println("\nAdding value in 2nd index : "+list);//[10,20,40, 30]
		
		//update value in specific index
		list.set(1,100);
		System.out.println("\nUpdate value in 1st index : "+list);//[10,100,40, 30]
		
		//remove element
		list.remove(3);
		System.out.println("\nRemove value in 3rd index : "+list);//[10,100,40,]
		
		//find size of the array
		System.out.println("\nArray Size : "+list.size());//
		
		//Traversing the array
		System.out.println("\nArray Elements : ");//
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
	}

}
