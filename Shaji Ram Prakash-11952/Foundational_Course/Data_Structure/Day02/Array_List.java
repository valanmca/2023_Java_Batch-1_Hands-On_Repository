package com.shaji.Day02;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Size : " + list.size());//0
		System.out.println(list);
		
		list.add(10);
		System.out.println("Size : " + list.size());//1
		
		list.add(20);
		list.add(30);
		list.add(null);
		
		System.out.println("Size : " + list.size());//4
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		list.add(2,24);// insert value in middle
		
		System.out.println("Size : " + list.size());//4
		System.out.println(list);

	}

}
