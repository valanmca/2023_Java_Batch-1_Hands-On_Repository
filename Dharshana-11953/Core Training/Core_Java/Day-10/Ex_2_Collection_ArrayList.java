package com.dharshu.day10;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex_2_Collection_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2)); //50
		list.remove(2); // Remove 50
		System.out.println(list);
		
		System.out.println();
		
		//Way-1
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println();
		
		//Way-2(Auto-Un-Boxing)
		for(Integer o : list) {
			System.out.println(o);
		}
		
		System.out.println();
		
		//Way-3
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
