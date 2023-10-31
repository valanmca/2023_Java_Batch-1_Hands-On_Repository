package com.purushoth.day_10;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		TreeSet<Integer> set1=new TreeSet<Integer>(Collections.reverseOrder());
		set.add(80);
		set.add(10);
		set.add(30);
		set.add(70);
		
		set1.add(80);
		set1.add(10);
		set1.add(30);
		set1.add(70);
		
		System.out.println(set);
		set.remove(30);
		System.out.println(set);
		
		//Way-2
		System.out.println("Way-2");
		for(Integer a:set) {
			System.out.println(a);
		}
		
		//Way-3
		System.out.println("Way-3");
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Reverse order: "+set1);

	}

}
