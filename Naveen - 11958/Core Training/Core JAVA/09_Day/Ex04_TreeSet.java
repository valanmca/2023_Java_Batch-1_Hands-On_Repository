package com.naveen.day9;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex04_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder());
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		list.remove(50);
		System.out.println(list);
		
		//Way-1
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Way-2
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
