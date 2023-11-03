package com.naveen.day9;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2)); //20
		list.remove(2);
		System.out.println(list);
		
		//Way-1
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Way-2
		for(Integer i : list) {
			System.out.println(i);
		}
		
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
