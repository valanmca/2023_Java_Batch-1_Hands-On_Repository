package com.gayathri.day5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class CountTreeMap {

	public static void main(String[] args) {

		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		LinkedList<Integer> inputList = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		// list size input from user
		System.out.print("Enter the size of the list : ");
		int size = sc.nextInt();

		// list number input from user
		System.out.println("\nEnter list numbers : ");
		for (int i = 0; i < size; i++) {
			int number = sc.nextInt();
			inputList.add(number);
		}

		// display list
		System.out.println("\nThe Initial List : " + inputList);

		// count number
		for (int i = 0; i < size; i++) {
			int count = 0;
			int get_number = inputList.get(i);
			while (get_number != 0) {
				get_number = (get_number / 10);
				count++;
			}
			//System.out.println("\n Total no.of.digits in " + inputList.get(i) + "  : " + count);
			tm.put(inputList.get(i), count);
		}
		System.out.println("\nKey Value result...."+tm);//by default, it will display ascending order.
sc.close();
	}

}
