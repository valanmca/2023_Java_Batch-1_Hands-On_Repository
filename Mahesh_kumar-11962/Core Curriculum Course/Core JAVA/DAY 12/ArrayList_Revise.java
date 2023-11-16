package com.mahesh.core_java_day_12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Revise {

	public static void main(String[] args) {

		ArrayList<Integer> Arr_lst = new ArrayList<Integer>();
		Arr_lst.add(10);
		Arr_lst.add(20);
		Arr_lst.add(70);
		Arr_lst.add(20);
		Arr_lst.add(170);
		System.out.println(Arr_lst);

		// way 01
		for (int i = 0; i < Arr_lst.size(); i++) {
			System.out.print(Arr_lst.get(i) + " ");
		}
		System.out.println("||");
		
		// way 02
		for (Integer ob : Arr_lst) {
			System.out.print(ob + " ");
		}
		System.out.println("||");
		
		// way 03
		Iterator<Integer> it = Arr_lst.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("||");
	}

}
