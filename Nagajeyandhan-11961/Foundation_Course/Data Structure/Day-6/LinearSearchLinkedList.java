//Linear Search using LinkedList

package com.jeyandhan.day06;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearchLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Grapes");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		System.out.println(list);

		System.out.println("Enter the String to Search: ");
		Scanner sc = new Scanner(System.in);

		String search = sc.next();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (search.equals(list.get(i))) {
				System.out.println("Element Present in the index: " + i);
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("Element is Not present in the list");
		}

	}

}
