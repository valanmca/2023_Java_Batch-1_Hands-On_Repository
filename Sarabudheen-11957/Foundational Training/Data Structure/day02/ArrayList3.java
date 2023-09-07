/*** Inserting,Adding the index values and updating ArrayList Elements... ***/
package com.sara.day02;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);// [10,20,30,40,50]

		int sum = list.get(2) + list.get(3);// Adding index value 2 and 3.
		System.out.println(sum);// 70

		list.add(0, sum);
		System.out.println(list);// [70,10,20,30,40,50]

		list.set(list.size() - 1, 100);
		System.out.println(list);// [70,10,20,30,40,100]

		list.remove(0);
		System.out.println(list);// [10,20,30,40,100]

	}

}
