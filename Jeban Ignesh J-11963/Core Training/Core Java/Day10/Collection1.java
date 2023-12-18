package com.jeban.Day10;
//ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection1 {

	public static void main(String[] args) {
//		ArrayList <Integer> list=new ArrayList<Integer>();  //ArrayList
//		HashSet<Integer>list=new HashSet<Integer>();  //Hashset
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder()); //TreeSet,it's one of the set
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);

		System.out.println("List:" + list);
//		System.out.println(list.get(2));
//		list.remove(2);
		list.remove(50);
		System.out.println(list);

		// way-1
//		for(int i=0;i<list.size();i++) {
//			System.out.println("List:"+list.get(i));  //It's not working without index number
//		}

		// way-2
		System.out.println("Way2:");
		for (Integer o : list) {
			System.out.println(o);
		}

		// way-3
		System.out.println("Way3:");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
