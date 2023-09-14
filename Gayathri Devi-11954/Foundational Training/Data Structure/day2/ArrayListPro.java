package com.gayathri.day2;

import java.util.ArrayList;

public class ArrayListPro {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList <Integer> ();
		//arraylist is in java collection frame work, it is in java util package, predefined class
		// <> generic concept
		System.out.println("Initial Array Size : "+list.size());
		System.out.println("Initial Array Elements : "+list);
				
		//adding new element
		list.add(12);//predefined method in arraylist
		System.out.println("\nAfter adding one element Array Size : "+list.size());
		System.out.println("After adding one element Array Elements : "+list);
		
		list.add(23);
		list.add(34);
		list.add(45);
		
		System.out.println("\nArray Size : "+list.size());
		System.out.println("Array Elements : "+list);
		
		//adding new element in specific location
		list.add(4, 56);
		System.out.println("\nArray Size : "+list.size());
		System.out.println("Array Elements : "+list);
		
		//remove a element in particular index
		list.remove(3);
		System.out.println("\nAfter removing Array Size : "+list.size());
		System.out.println("After removing Array Elements : "+list);
		
		//remove a element
		list.remove(1);
		System.out.println("\nAfter removing Array Size : "+list.size());
		System.out.println("After removing Array Elements : "+list);
	}

}
