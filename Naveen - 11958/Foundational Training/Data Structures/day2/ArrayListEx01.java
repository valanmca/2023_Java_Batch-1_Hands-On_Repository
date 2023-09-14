package com.naveen.day2;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		System.out.println("Size :"+list.size()); //0
		System.out.println(list); //empty
		
		list.add(10);
		System.out.println("Size :"+list.size()); //1
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Size :"+list.size()); //4
		System.out.println(list); //[10,20,30,40]
		
		list.remove(2); //Removing Element by using Index
		
		System.out.println("Size :"+list.size()); //3
		System.out.println(list); //[10,20,40]
		
		list.add(1, 55); //Inserting Element in the middle with help of Index
		
		System.out.println("Size :"+list.size()); //4
		System.out.println(list); //[10,55,20,40]
		
		list.remove(1); //Remove 55
		System.out.println("Size :"+list.size()); //3
		System.out.println(list); //[10,20,40]
		
		
	}

}
