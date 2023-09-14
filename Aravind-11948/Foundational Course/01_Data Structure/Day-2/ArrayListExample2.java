package com.aravind.day2;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		list.set(1, 25);// updating the value of list at index1 syntax =set(index,value);

		System.out.println(list);

		list.get(1);// ans=25 because it print the value at particular index syntax=get(index);

		System.out.println(list.get(1));// 25

		System.out.println("array elements are =");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// printing the whole list
		}

	}

}
