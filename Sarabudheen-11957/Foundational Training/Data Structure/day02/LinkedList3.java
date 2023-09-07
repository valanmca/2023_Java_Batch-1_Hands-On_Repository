/***** Getting ODD and EVEN Numbers from the LinkedList... *****/
package com.sara.day02;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList3 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> odd_list = new LinkedList<Integer>();
		LinkedList<Integer> even_list = new LinkedList<Integer>();
		System.out.println("Enter The List Size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			list.add(element);

		}
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) % 2 == 0) {
				even_list.add(list.get(i));

			} else
				odd_list.add(list.get(i));
		}
		System.out.println("The ODD List : " + odd_list);
		System.out.println("The EVEN List : " + even_list);
	}
}