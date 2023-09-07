package com.shaji.Day06;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearch_Algorithm2 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Orange");
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Pineapple");
		list.add("Banana");

		System.out.println("Enter the Fruit to search : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (s.equals(list.get(i))) {
				System.out.print("Fruit Present in the index : " + i);
				isPresent = true;
				break;
			}
		}

		if (isPresent == false)
			System.out.println("Fruit is Absent...");
	}

}
