package com.naveen.day7;

import java.util.ArrayList;
import java.util.Scanner;

//Bubble sort using ArrayList.
public class SortingEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> listNew = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for (int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		System.out.println("The Given ArrayList are :");

		System.out.println(list);

		System.out.println("Sorted ArrayList are :");

		int temp;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}

		}
		for (int i = 0; i < 5; i++) {
			listNew.add(list.get(i));
		}

		System.out.println(listNew);

		sc.close();
	}

}
