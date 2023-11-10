package com.madhan.coreday10;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet<Integer> list=new HashSet<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		System.out.println(list.remove(10));
		System.out.println(list);
		
				
		//way-2
		for(Integer o :list)
		{
			System.out.println(o);
		}
		
		//way-3
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
