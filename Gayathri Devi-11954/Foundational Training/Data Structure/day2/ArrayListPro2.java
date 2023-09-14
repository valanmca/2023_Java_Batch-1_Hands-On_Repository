package com.gayathri.day2;

import java.util.ArrayList;

public class ArrayListPro2 {

	public static void main(String[] args) {
		ArrayList <Integer> list =new  ArrayList <Integer>();
		list.add(12);
		list.add(23);
		list.add(34);
		list.add(45);
		
		System.out.println("\nArray Size : "+list.size());
		System.out.println("Array Elements : "+list);
		
		//update or replace
		list.set(1, 10);
		System.out.println("\nArray Size : "+list.size());
		System.out.println("Updating Array Elements : "+list);
		
		//get specific index element
		System.out.println("\nGet specific index element : "+list.get(1));
		
		//array traversing
		System.out.println("\n Array elements are.....");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
