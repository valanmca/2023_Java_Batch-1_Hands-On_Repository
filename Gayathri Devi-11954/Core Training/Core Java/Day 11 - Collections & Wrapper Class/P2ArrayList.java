package com.gayathri.day11CollectionandWrapperclass;
import java.util.ArrayList;
import java.util.Iterator;
public class P2ArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		list.add(10);//0
		list.add(20);//1
		list.add(40);//2
		list.add(30);//3
		list.add(20);//4	//allow duplicates
		list.add(10);//5	//allow duplicates
		
		System.out.println(list);//output will be a given manner - [10, 20, 40, 30, 20, 10]
		
		System.out.println((list.get(4)));//20
		
		list.remove(5);
		System.out.println(list);
		
		//way1
		System.out.println("Way - 1");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
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
