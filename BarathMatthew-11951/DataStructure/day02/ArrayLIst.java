package com.matthew.day02;
import java.util.ArrayList;
public class ArrayLIst {

	public static void main(String[] args) {
		//Creating an object for ArrayList 
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Displaying the empty List and size 
		System.out.println("Displaying the empty List and size");
		System.out.println("List : "+list);
		System.out.println("List Size :"+list.size());
		//Adding element in the list
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		//Printing the list after adding elements
		System.out.println("Printing the list after adding elements");
		System.out.println("List : "+list);
		System.out.println("List Size : "+list.size());
		//Removing By using INdex
		System.out.println("Printing the list after Removing By using INdex");
		list.remove(2);
		System.out.println("List : "+list);
		System.out.println("List Size : "+list.size());
		//adding elements in between the list using index
		list.add(1,100);
		System.out.println("Printing the list after adding elements in between the list using index");
		System.out.println("List : "+list);
		System.out.println("List Size : "+list.size());
		//update
		list.set(2, 10);
		System.out.println("Update (set) ");
		System.out.println("List : "+list);
		System.out.println("List Size : "+list.size());
		//get
		int val = list.get(list.size()-1);
		System.out.println("get element in the list ");
		System.out.println("get : "+val);
		System.out.println("List Size : "+list.size());
		//traverse the list
		System.out.println("Traversing the list ");
		for (int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));	
		}
	}

}
