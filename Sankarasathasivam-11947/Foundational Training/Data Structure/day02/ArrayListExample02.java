package com.shiva.day02;

//Adding,updating & getting values

import java.util.ArrayList;

public class ArrayListExample02 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(null);
		
		System.out.println(list);// [10,20,30,40]
		
		list.set(1, 25); // Updating the  value and replaces another value
		System.out.println(list);//[10,25,30,40]
		
		System.out.println(list.get(1));//25 (getting specific value from the index)

		System.out.println("Array List Elements are : ");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}

}
