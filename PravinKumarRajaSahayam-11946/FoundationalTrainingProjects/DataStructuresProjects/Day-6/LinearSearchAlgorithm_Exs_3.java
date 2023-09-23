//Searching Element using LinkedList in the String format
package com.pravinkiumar.day6;

import java.util.Scanner;
import java.util.LinkedList;
//Linear Search Algorithm - LinkedList
public class LinearSearchAlgorithm_Exs_3 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Carrot");
		list.add("Even");
		list.add("Odd");

		System.out.println("Enter the String to Search");
		Scanner sc = new Scanner(System.in);
		String k = sc.next();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k.equals(list.get(i))) {
				System.out.println("Element Present in the Index : " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element is Not Presents:");
		}
	}
}
