package com.gayathri.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistCount {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers do you want in your list ? : ");
		int list_size = sc.nextInt();

		// inserting elements input from user
		System.out.println("Enter " + list_size + " elements : ");
		for (int i = 0; i < list_size; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("\n List elements are : " + list);

		for (int i = 0; i < list_size; i++) {
			int count = 0;
			int number = list.get(i);
			while (number != 0) {
				
				number = (number / 10);
				count++;
			}
			System.out.println("\n Total no.of.digits in " + list.get(i) + "  : " + count);
			list2.add(count);
			
		}list2.add(null);
		System.out.println("\n List 2 elements are : " + list2);

		sc.close();

	}

}