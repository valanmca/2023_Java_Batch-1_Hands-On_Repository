//Add, remove,update,traverse elements in LinkedList

package com.jeyandhan.day02;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		
		list.add(10); //adding elements
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("The elements in the list are: "+list);// display  elements in the list
		
		list.add(3,70); //Inserting element with index
		System.out.println("The elements in the list are: "+list);
		
		list.set(2, 90); //updating an element
		System.out.println("The elements in the list after updating: "+list);
		
		list.remove(3); //removing an element
		System.out.println("The elements in the list after removing: "+list);
		
		System.out.println("The Elements in the list are: "); 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); //Printing elements one by one
		}
	}

}
