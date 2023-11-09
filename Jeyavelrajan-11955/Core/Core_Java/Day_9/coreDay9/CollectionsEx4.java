package com.jeyavel.coreDay9;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionsEx4 {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder());
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list); //List is a ordered collection 50
		list.remove(50);//remove 50
		System.out.println(list);
		
		//Way 1 
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list);
//		}
		//Way 2
		for(Integer o:list) {
			System.out.println(o);
		}
		
		//Way3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
