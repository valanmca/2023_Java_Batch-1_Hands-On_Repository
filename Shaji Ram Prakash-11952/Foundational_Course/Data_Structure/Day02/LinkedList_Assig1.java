package com.shaji.Day02;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Assig1 {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of LinkedList : ");
		int n = sc.nextInt();
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			list1.add(temp);
		}
		System.out.println("List1:" + list1);

		for (int i = 0; i < n; i++) {
			int count = 0;
			int num = list1.get(i);
			while (num != 0) {
				num = num / 10;
				count++;

			}
			list2.add(count);
			System.out.println("Total no.of Digits : " + list1.get(i) + " is " + count);

		}
	}

}
