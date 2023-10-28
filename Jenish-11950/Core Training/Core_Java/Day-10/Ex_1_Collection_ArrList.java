package com.jenish.day10;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_1_Collection_ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));  //20
		list.remove(2); //it remove 50
		System.out.println("Default order:" + list);

		//Way-1
		for(int i = 0; i<list.size(); i++) {
			System.out.println("Way 1:" + list.get(i));
		}
		
		//Way-2
		for(int o : list) {  //Auto-un-Boxing
			System.out.println("Way2" + o);
			
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		}
	}

}
