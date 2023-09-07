package com.matthew.day02;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("List : "+list);
		int sum = 0;
		for (int i = 0;i<list.size();i++) {
			sum +=list.get(i);
		}
		System.out.println("Sum :"+sum);
		System.out.println("sum of 2 and 3 rd element :" +(list.get(1)+list.get(2)));
		list.set(0, sum);
		System.out.println("Inserting sum at 0 :"+list);
		list.add(100);
		System.out.println("Inserting 100 at last :"+list);
		list.remove(0);
		System.out.println("Removing 0th index(First Element) :"+list);
	}

}
