package com.mahesh.core_java_day_12;

import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;

public class Treeset_Revise {

	public static void main(String[] args) {
		TreeSet<Integer> t_set = new TreeSet<Integer>(Collections.reverseOrder());
		t_set.add(10);
		t_set.add(20);
		t_set.add(70);
		t_set.add(20);
		t_set.add(170);
		System.out.println(t_set);

		/*
		 * t_set.remove(2);
		 * 
		 * its not possible for (int i = 0; i < t_set.size(); i++) {
		 * System.out.print(t_set.get(i) + " "); }
		 */

	

		// way 02
		for (Integer ob : t_set) {
			System.out.print(ob + " ");
		}
		System.out.println("||");

		// way 03
		Iterator<Integer> it = t_set.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("||");
	}

	}



