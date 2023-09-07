package com.madhan.day02;
import java.util.ArrayList;

public class ArrListassgnmt1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		// sum of index 2 and 3
//		int sum=list.get(2)+list.get(3);
		System.out.println("Sum of index:"+(list.get(2)+list.get(3)));
		
		//insert sum value at index 0
		list.add(0,(list.get(2)+list.get(3)));
		
		//print the ArrayList
		System.out.println(list);
		
		//Replace the last element of array with 100
		list.set(list.size()-1, 100);
		
		//verified the result
		System.out.println(list);
		
		//Remove the first element from arraylist
		list.remove(0);
		
		//Verified the result
		System.out.println(list);
		
	}

}
