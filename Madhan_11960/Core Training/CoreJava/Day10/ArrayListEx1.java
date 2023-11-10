package com.madhan.coreday10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(10);

		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.remove(1));
		System.out.println(al);
		
		//Way-1
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//way-2
		for(Integer o :al)
		{
			System.out.println(o);
		}
		
		//way-3
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		

	}

}
