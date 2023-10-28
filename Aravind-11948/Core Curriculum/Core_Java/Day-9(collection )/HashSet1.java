package com.core.day_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> list=new HashSet <Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		
		
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
