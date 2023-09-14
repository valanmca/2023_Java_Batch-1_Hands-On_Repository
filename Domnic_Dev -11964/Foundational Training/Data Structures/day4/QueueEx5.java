//palindrome or not in queue
package com.domnic.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class QueueEx5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list :");
		int n = sc.nextInt();
		System.out.println("Enter the Elements :");
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}

		System.out.println(list1);
		int temp = 0;
		for (int i = n - 1; i >= 0; i--) {
			temp = list1.get(i);
			list2.add(temp);
		}
		System.out.println(list2);

		if (list1.isEmpty() == true) {
			System.out.println("It is a Palindrome ");
		} else {
			for (int i = 0; i <= n; i++) {
				int a = list1.get(i);
				int b = list2.get(i);
				if (a == b) {
					temp = 1;
					break;
				} else {
					temp = 0;
					break;

				}

			}

			if (temp == 1) {
				System.out.println("It is a Palindrome");
			} else {
				System.out.println("Not Palindrome");
			}
		}

	}
}
