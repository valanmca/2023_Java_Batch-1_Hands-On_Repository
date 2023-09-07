package com.gayathri.assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers do you want in your list ? : ");
		int list_size = sc.nextInt();

		// inserting elements input from user
		System.out.println("Enter " + list_size + " elements : ");
		for (int i = 0; i < list_size; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("\n List elements are : " + list);
		System.out.println("Enter search element : ");
		int search = sc.nextInt();
		int store = 0;
		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == search) {
				store = i;
				isPresent = true;
				System.out.println("The Element is found in : " + store + " " + "index");
				break;
			}
		}
		if(isPresent==false)
			System.out.println("-1");

		sc.close();

	}

}
