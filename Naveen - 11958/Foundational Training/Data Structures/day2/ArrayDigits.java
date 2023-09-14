package com.naveen.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDigits {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> countedList = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array :");
		int range = sc.nextInt();

		System.out.println("Enter The List Values :");
		for (int i = 0; i < range; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("The List are :" + list);

		for (int i = 0; i < range; i++) {
			int count = 0;
			int n = list.get(i);
			while (n > 0) {
				n = n / 10;
				count++;
			}
			countedList.add(count);
		}

		sc.close();

		System.out.println("The Counted Digits List:" + countedList);

		for (int i = 0; i < range; i++) {
			System.out.println("Total Number of digits in " + list.get(i) + " :" + countedList.get(i));
			
		}

	}

}
