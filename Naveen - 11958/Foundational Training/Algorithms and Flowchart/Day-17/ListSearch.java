package com.naveen.day17;

import java.util.LinkedList;
import java.util.Scanner;

//Linear Search using LinkedList
public class ListSearch {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		

		System.out.println("Enter the Element to Search :");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k == list.get(i)) {
				System.out.println("Element present in the Index : " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element Not present");
		}
		sc.close();
	}

}
