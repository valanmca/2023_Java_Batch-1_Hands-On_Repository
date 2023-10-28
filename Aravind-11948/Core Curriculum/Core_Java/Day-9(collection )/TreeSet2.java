package com.core.day_09;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet <Integer>(Collections.reverseOrder());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(40);
		
		
		
		
		System.out.println(list);
		list.remove(1);
		
		System.out.println(list);
		
//		// way-1 doesnt work in hashset because it is not index based 
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		// way-2
		
		for(int i:list)
		{
			System.out.println(i);
		}
		
		//way -3
		Iterator <Integer> it= list.iterator();
		
		System.out.println(it.hasNext());
//		System.out.println(it.next());
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		


	}

}
