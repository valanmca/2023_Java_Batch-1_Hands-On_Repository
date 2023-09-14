package com.shiva.day02;

import java.util.LinkedList;

public class LinkedListExample01 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		//Adding Elements at the End
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);//[10,20,30,40]
		
		list.add(1,25); //Inserting element using index value
		System.out.println(list);//[10,25,20,30,40]
		
		list.set(1, 100); //Update
		System.out.println(list);//[10,100,20,30,40]
		
		list.remove(1);
		System.out.println(list);//[10,20,30,40]
		
		System.out.println("Size of the array: "+list.size()); //4
		
		System.out.println("Elements in the List ");
		for(int i=0;i<list.size();i++) //Traversing
		{
			System.out.println(list.get(i));
		}
	}

}
