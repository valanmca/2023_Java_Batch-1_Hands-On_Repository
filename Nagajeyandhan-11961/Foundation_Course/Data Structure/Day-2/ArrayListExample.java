//Add, remove,replace elements in ArrayList
package com.jeyandhan.day02;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("The size of Array is: "+list.size()); // size of the list
		System.out.println(list); //Empty list
		
		list.add(55); //inserting elements
		list.add(89);
		list.add(12);
		
		System.out.println("The size of Array is: "+list.size());
		System.out.println(list); 
		
		list.add(3,46); // inserting element in the middle with index value
		list.add(0,10);
		
		System.out.println("The size of Array is: "+list.size());
		System.out.println(list);
		
		list.remove(3); // removing element by index 
		System.out.println("The size of Array is: "+list.size());
		System.out.println(list);

	}

}
