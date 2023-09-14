//Binary search in ArrayList
package com.domnic.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarysearchLl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the Total no.of Elements needed in list ");
		int total = sc.nextInt();
		System.out.println("Enter " + total + " Elements");
		for (int i = 0; i < total; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Before sorting " + list);
		list.sort(null);
//        System.out.println();
		System.out.println("\nAfter sorting " + list);

		System.out.println("\nEnter the Value to be found :");
		int value = sc.nextInt();

		int start = 0;
		int end = list.size() - 1;
		int count = 0;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (list.get(middle) == value) {
				System.out.println(value + " is present" + middle);
				count++;
				break;
			}
			if (list.get(middle) < value) {
				start = middle + 1;
			}
			if (list.get(middle) > value) {
				end = middle - 1;
			}
		}
		if (count == 0) {
			System.out.println(value + " is not present ");
		}

	}

}
