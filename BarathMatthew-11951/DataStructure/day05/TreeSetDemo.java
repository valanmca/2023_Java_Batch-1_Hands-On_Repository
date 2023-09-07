//TreeSet First
package com.matthew.day05;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> list = new TreeSet<Integer>();
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
