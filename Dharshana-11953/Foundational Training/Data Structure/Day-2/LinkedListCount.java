package com.dharshu.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCount {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number :");
		int list_size = sc.nextInt();
		System.out.println("Enter the " + list_size + " of the element:");
		for (int i = 0; i < list_size; i++) {
			int num1 = sc.nextInt();
			list.add(num1);
		}
		System.out.println("The elements in an list is:" + list);
		for (int i = 0; i < list_size; i++) {
			int count = 0;
			int num1 = list.get(i);
			while (num1 > 0) {
				num1 = num1 / 10;
				count++;

				// System.out.println("Total no.of digits:"+count);
			}
			System.out.println("Total no.of digits:" + list.get(i) + ":" + count);
			list1.add(count);

		}
		System.out.println("The elements in an list is:" + list1);

	}
}
