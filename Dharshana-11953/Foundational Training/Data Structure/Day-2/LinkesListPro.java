package com.dharshu.day2;

import java.util.LinkedList;

public class LinkesListPro {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		//LinkedList<String> list=new LinkedList<String>();
		
		//adding the element at the end
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("The elements are:----------"+list);
		
		//inserting the element in middle with the help of the index
		list.add(1,25);
		System.out.println("After inserting the element in middle"+list);
		
		//update
		list.set(1,100);
		System.out.println("After updating the element in middle"+list);
		
		//remove
		list.remove(1);
		System.out.println("After element the element in middle"+list);
		
		//find the size of the array
		System.out.println( list);
		System.out.println("Total no.of element in a list:"+list.size());
		
		//traversing
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
