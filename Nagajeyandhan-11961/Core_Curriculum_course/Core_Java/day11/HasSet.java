package com.jeyandhan.day11;


import java.util.HashSet;
import java.util.Iterator;

public class HasSet {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>();
		
		list.add(10);
		list.add(19);
		list.add(49);
		list.add(10);
		list.add(30);
		list.add(45);
		
		System.out.println(list);
		list.remove(10);
		System.out.println(list);
		
		
		System.out.println("\n");
		for (Integer i : list) { 
			System.out.println(i);
		}
		
		System.out.println("\n");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
