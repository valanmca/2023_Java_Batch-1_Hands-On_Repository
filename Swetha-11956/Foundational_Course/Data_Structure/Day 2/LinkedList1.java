package com.swetha.day2;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		//Adding the elements to the linked list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("The list elements are : "+list);
		
		//Inserting an element in the list at index 1
		list.add(1,25);
		System.out.println("Inserting an element in the list at index 1 : "+ list);
		
		//Update the element 100 at index 1
		list.set(1, 100);
		System.out.println("After Updating the element 100 at index : "+list);
		
		//Remove elemnent at index 1
		list.remove(1);
		System.out.println("After removing an element from index 1 :"+list);
		
		//Printing the size of list
		System.out.println("The size of the list is "+list.size());
		
		System.out.println("The list elements are :");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
