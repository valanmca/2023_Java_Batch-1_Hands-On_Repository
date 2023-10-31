package com.purushoth.day_10;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(70);
		list.add(50);
		list.add(30);
		list.add(20);
		
		System.out.println(list);
		System.out.println(list.get(3)); //20
		System.out.println(list.remove(2)); //50
		System.out.println(list);
		
		//Way-1
		System.out.println("Way-1");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//Way-2
		System.out.println("Way-2");
		for(Integer a:list) {
			System.out.println(a);
		}
		
		//Way-3
		System.out.println("Way-3");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
