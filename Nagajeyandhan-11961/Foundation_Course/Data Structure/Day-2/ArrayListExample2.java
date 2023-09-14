//Add, update,traverse elements in ArrayList

package com.jeyandhan.day02;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(55); //inserting elements
		list.add(89);
		list.add(12);
		System.out.println("The elements in the list are:"+list);
		
		list.set(1, 60); //updating the element
		System.out.println("The elements in the list after update is: "+list);
		
		System.out.println("The element is: "+list.get(2)); //display one element
		
		for(int i=0;i<list.size();i++) {
			System.out.println("The elements are: "+list.get(i)); //printing all elements
		}

	}

}
