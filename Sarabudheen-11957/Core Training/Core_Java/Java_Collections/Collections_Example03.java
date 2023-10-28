//Java Collections - HashSet Example
package com.sara.CoreJava.Day_11;

import java.util.HashSet;
import java.util.Iterator;

public class Collections_Example03 {

	public static void main(String[] args) {
		HashSet<Integer> list = new HashSet<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		System.out.println(list.remove(2));
		System.out.println(list);
		
		
		//way-1
		System.out.println("Way-1...");	
			System.out.print(list);
			System.out.print(" ");
		System.out.println(" ");	
		
		//way-2
		System.out.println("Way-2...");	
		for(Integer o : list) {
			System.out.print(o);
			System.out.print(" ");
			}
		System.out.println(" ");
		
		//way-3
		System.out.println("Way-3...");	
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(" ");
		}
	}

}
