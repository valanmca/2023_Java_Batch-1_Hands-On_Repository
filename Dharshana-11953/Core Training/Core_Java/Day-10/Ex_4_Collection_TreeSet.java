package com.dharshu.day10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex_4_Collection_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet<Integer>(Collections.reverseOrder());
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);

		list.remove(50); // Remove 50
		System.out.println(list);
		
	// The First Way is not worked in Set because set is non index based collection
		
		System.out.println();
		
		//Way-2(Auto-Un-Boxing)
		for(Integer o : list) {
			System.out.println(o);
		}
		
		System.out.println();
		
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
