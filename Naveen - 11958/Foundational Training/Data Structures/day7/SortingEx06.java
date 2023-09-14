//DATA STRUCTURES ENDS.....

package com.naveen.day7;

import java.util.LinkedList;
import java.util.Scanner;

//Selection sort using LinkedList.
public class SortingEx06 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> listNew = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Values");
		for (int i = 1; i <= 5; i++) {
			int n = sc.nextInt();
			list.add(n);
		}
		
		System.out.println("The Given List are :");

		System.out.println(list);

		System.out.println("Sorted List are: ");

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
