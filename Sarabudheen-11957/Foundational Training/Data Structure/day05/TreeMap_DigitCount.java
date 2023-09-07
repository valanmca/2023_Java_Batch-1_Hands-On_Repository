/******* Counting the No.of.Digit Using TreeMap... *******/
package com.sara.day05;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_DigitCount {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		System.out.println("Enter The List Size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter The Elements : ");
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			list1.add(element);

		}
		System.out.println("The Elements in the List : " + list1);

		for (int i = 0; i < size; i++) {
			int count = 0;
			int num = list1.get(i);
			while (num != 0) {
				num /= 10;
				count++;

			}
			list2.add(count);
		}
		System.out.println("The DigitCount List : " + list2);

		for (int i = 0; i < size; i++) {
			map.put(list1.get(i), list2.get(i));
		}
		System.out.println(map);
	}

}
