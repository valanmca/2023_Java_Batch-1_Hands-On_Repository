package com.mahesh.core_java_day_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Revise {

	public static void main(String[] args) {
		HashSet<Integer> h_set = new HashSet<Integer>();
		h_set.add(10);
		h_set.add(20);
		h_set.add(70);
		h_set.add(20);
		h_set.add(170);
		System.out.println(h_set);

		/*
		 * h_set.remove(2);
		 * 
		 * its not possible for (int i = 0; i < h_set.size(); i++) {
		 * System.out.print(h_set.get(i) + " "); }
		 */

	

		// way 02
		for (Integer ob : h_set) {
			System.out.print(ob + " ");
		}
		System.out.println("||");

		// way 03
		Iterator<Integer> it = h_set.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("||");
	}
}
