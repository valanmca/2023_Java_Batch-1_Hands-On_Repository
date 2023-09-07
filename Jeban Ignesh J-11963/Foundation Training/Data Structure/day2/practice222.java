package com.jeban.day2;

import java.util.*;

public class practice222 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
//		LinkedList<Integer> list1=new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int jeb = sc.nextInt();
		System.out.println("List:");
		for (int i = 0; i < jeb; i++) {
			int j = sc.nextInt();
			list.add(j);
		}
		System.out.println("List:" + list);
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			int number = list.get(i);
			while (number != 0) {
				number = number / 10;
				count++;

			}
			System.out.println("Total Number of Digits in " + list.get(i) + ":" + count);
		}
	}

	// TODO Auto-generated method stub

}
