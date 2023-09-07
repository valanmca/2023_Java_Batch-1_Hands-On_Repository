package com.aravind.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeAss {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of list");
		int size = sc.nextInt();
		System.out.println("enter the values of list");
		for (int i = 0; i < size; i++) {
			int val = sc.nextInt();
			list.add(val);

		}
		System.out.println(list);

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i = size - 1; i >= 0; i--) {
			int temp = list.get(i);
			list1.add(temp);
		}
		System.out.println("reversed list:" + list1);

		int temp = 0;

		if (list.isEmpty() == true) {
			System.out.println("palindrome");
		} else {
			for (int i = 0; i < size; i++) {
				temp = 0;
				int val1 = list.get(i);
				int val2 = list1.get(i);
				if (val1 == val2) {
					temp = 1;
				} else {
					temp = 0;
					break;
				}

			}
			if (temp == 0) {
				System.out.println("not an palindrome");
			}

			else {
				System.out.println("palindrome");

			}
		}

		/*
		 * if(temp==0) { System.out.println("not an palindrome"); }
		 * 
		 * else { System.out.println("palindrome");
		 * 
		 * }
		 */

	}
}
