package com.gayathri.day11CollectionandWrapperclass;

import java.util.TreeSet;//store random memory location
import java.util.Collections;
import java.util.Iterator;
public class P4TreeSet {

	public static void main(String[] args) {
		TreeSet <Integer> list = new TreeSet <Integer> (Collections.reverseOrder());//normal ascending - we can change order as descending
		list.add(80);//0
		list.add(20);//1
		list.add(50);//2
		list.add(30);//3
		list.add(20);//4	//dont allow duplicates
		
		
		System.out.println(list);//output will be a given manner - [10, 20, 40, 30, 20, 10]
		
		//System.out.println((list.get(4)));//20
		
		//list.remove(5);//here 5 means value.so we give value to remove
		list.remove(50);
		System.out.println(list);
		
		
		/* not responding
		 //way1
		 
		System.out.println("Way - 1");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}*/
		
		//way2
		System.out.println("Way - 2");
		for(Integer o:list) {
			System.out.println(o);
		}
		
		//way3
		System.out.println("Way - 3");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
