/*********** Find the List is Palindrome or Not...**********/
package com.sara.day04;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		LinkedList<Integer> initial_list = new LinkedList<Integer>();
		LinkedList<Integer> reversed_list = new LinkedList<Integer>();
		System.out.println("Enter The List Size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			initial_list.add(element);

		}
		System.out.println("The Initial List is : " + initial_list);

		for (int i = size - 1; i >= 0; i--) {
			int temp = initial_list.get(i);
			reversed_list.add(temp);
		}
		System.out.println("The Reversed List is : " + reversed_list);

		int count = 0;
		for (int i = 0; i < size; i++) {
			if ((initial_list.get(i)).equals(reversed_list.get(i))) {
				count++;
			} else {
				System.out.println("List is Not Palindrome");
				count = 0;
				break;
			}

			if (count == 1) {
				System.out.println("List is Palindrome");
			}
		}

	}

}
