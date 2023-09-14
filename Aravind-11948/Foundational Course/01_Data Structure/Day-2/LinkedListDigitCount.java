package com.aravind.day2;// hw;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println("enter the value of size of list");
		int size = sc.nextInt();
		System.out.println("enter list 1 values");
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			list.add(value);
		}

		LinkedList<Integer> digitcount = new LinkedList<Integer>();
		int count;
		for (int i = 0; i < size; i++) {
			int temp = list.get(i);
			if (temp == 0) {
				count = 1;

			} else {
				count = 0;
				while (temp != 0) {
					count = count + 1;
					temp = temp / 10;

				}
			}
			digitcount.add(count);
		}
		System.out.println(digitcount);

		for (int i = 0; i < size; i++) {
			System.out.println("Total no of digits in  " + list.get(i) + " : " + digitcount.get(i));
		}
	}

}
