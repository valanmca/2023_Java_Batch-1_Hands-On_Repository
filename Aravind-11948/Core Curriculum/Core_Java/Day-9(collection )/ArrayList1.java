package com.core.day_09;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(1,20);
		list.add(30);
		System.out.println(list);
		list.set(1,40 );
		
		System.out.println(list);
		list.remove(1);
		
		System.out.println(list);
		
		// way-1
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
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
