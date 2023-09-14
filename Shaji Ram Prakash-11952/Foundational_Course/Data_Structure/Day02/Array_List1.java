package com.shaji.Day02;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);//[10,20,30,40]
		
		list.set(1, 24); // update method
		System.out.println(list);//[10,24,30,40]
		
		System.out.println(list.get(1));//24
		
		System.out.println("Array List Elements are : " );
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
