package com.jeban.day2;

import java.util.LinkedList;
import java.util.*;

public class Home {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		for (int i = 0; i < n; i++) {
			int jeb = sc.nextInt();
			list.add(jeb);
		}

		System.out.println("List:" + list);
		for (int i = 0; i < n; i++) {
			int count = 0;
			int number = list.get(i);
			while (number != 0) {
				number = number / 10;
				count++;
			}
			
			System.out.println("Total Number Of Digits in  " + list.get(i) + ":" + count);
			list1.add(count);
		}
		System.out.println("List1:" + list1);
	}
}
