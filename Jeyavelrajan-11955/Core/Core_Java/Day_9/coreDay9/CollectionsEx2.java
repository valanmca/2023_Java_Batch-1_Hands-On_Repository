package com.jeyavel.coreDay9;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionsEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list); //List is a ordered collection
		System.out.println(list.get(2));//50
		list.remove(2);//remove 50
		System.out.println(list);
		
		//Way 1 
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
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
