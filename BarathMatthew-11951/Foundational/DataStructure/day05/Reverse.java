//reversing the list using 
package com.matthew.day05;
import java.util.TreeSet;
import java.util.Collections;
public class Reverse {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>(Collections.reverseOrder()); 
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(44);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(-34);
		list.add(-99);
		System.out.println(list);
	}
}
