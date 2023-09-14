package com.gayathri.day2;

import java.util.ArrayList;

public class ArrayListExercise1 {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Initial Array Elements are...."+list);
		
		//sum of index 2 & 3
		int sum = 0;
		for(int i=2; i<4;i++) {
			sum = sum +list.get(i);	
		}	
		System.out.println("Sum : "+sum);
		
		//insert this sum value into the array list @ index 0
		list.add(0,sum);
		System.out.println("After inserting sum value into index 0...."+list);
		
		//replace
		list.set(5,100);
		System.out.println("After replacing the element in 5th index...."+list);
		
		//remove the 1st element
		list.remove(0);
		System.out.println("After remove the 1st element(index 0)...."+list);
		
	}
	}
