package com.naveen.day7;

import java.util.ArrayList;
import java.util.Scanner;

//Selection sort using ArrayList.
public class SortingEx05 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listNew = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for (int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println("The Given List are :");

		System.out.println(list);

		System.out.println("Sorted Array are: ");

		for (int i = 0; i < 5; i++) {
			int min = i;
			for (int j = i + 1; j < 5; j++) {
				if (list.get(min) > list.get(j)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);

		}

		for (int i = 0; i < 5; i++) {
			listNew.add(list.get(i));
		}

		System.out.println(listNew);


		sc.close();

	}

}
