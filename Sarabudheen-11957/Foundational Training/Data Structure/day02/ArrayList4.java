/***** Multiplying the number with an ArrayList Elements... *****/
package com.sara.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList4 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list1.add(i);
		}
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int Number = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			list2.add(list1.get(i) * Number);
		}

		System.out.println(list2);
	}

}