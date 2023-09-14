package com.domnic.day2;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		System.out.println("The size of Array list :"+list.size());
		System.out.println("Elements of the List :"+list);
		list.add(30);         //Adding values in list
		list.add(40);
		list.add(70);
		list.add(80);
		System.out.println();
		System.out.println("The size of Array list :"+list.size());
		System.out.println("Elements of the List :"+list);
		list.remove(3);
		list.remove(1);    // Removing the Values from list
		System.out.println();
		System.out.println("The size of Array list :"+list.size());
		System.out.println("Elements of the List :"+list);
		list.add(0,54);     //Adding values by using Index
		list.add(1,34);
		System.out.println();
		System.out.println("The Size of the list is :" + list.size());
		System.out.println("Elements of the List :"+list);
	}

}
