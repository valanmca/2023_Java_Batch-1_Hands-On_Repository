package com.jeyandhan.day11;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(19);
		list.add(49);
		list.add(10);
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) { //way1
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		for (Integer i : list) { //way2
			System.out.println(i);
		}
		
		System.out.println("\n");
		Iterator<Integer> it = list.iterator(); //way3
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
