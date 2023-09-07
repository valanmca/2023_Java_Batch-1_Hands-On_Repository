package com.domnic.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAssg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the size of Arraylist :");
		int n = sc.nextInt();
		System.out.println("Enter the Elements :");
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println(list1);

		for (int i = 0; i < list1.size(); i++) {
			int count = 0;
			int num = list1.get(i);
			while (num != 0) {
				num = num / 10;
				count++;
			}

			list2.add(count);
			System.out.println("total no.of digits in : " + list1.get(i) + " is " + count);
		}

	}

}
