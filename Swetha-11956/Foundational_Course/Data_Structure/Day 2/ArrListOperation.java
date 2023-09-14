package com.swetha.day2;
import java.util.ArrayList;
public class ArrListOperation {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(); //Creating ArrayList
		
		//Adding elements in ArrayList
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		//Updating element in the list
		list.set(1, 15);  
		System.out.println("After Updation " +list);
		
		//Getting an element of index 1
		System.out.println("Element at first index : ");
		System.out.println(list.get(1)); 
		
		//Printing list elements
		System.out.println("ArrayList elements are : ");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		

	}

}
