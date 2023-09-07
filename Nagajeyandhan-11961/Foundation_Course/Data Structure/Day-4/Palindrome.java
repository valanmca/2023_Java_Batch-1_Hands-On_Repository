//Palindrome

package com.jeyandhan.day04;

import java.util.Scanner;

import java.util.LinkedList;

import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		System.out.println("Enter the value: ");
		for (int i = 0; i < size; i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println(list);

		for (int i = size - 1; i >= 0; i--) {
			int temp = list.get(i);

			list1.add(temp);
		}
		System.out.println(list1);

		int count = 0;
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(list1.get(i))) {
				count++;
			} else {
				System.out.println("Not a Palindrome");
				count = 0;
				break;
			}
			if (count == 1) {
				System.out.println("Palindrome");
			}

		}

	}
}
