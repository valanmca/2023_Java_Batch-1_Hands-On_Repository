package com.naveen.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeList {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<Integer>();
		ArrayList<Integer> list02 = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the Array :");
		int range = sc.nextInt();

		System.out.println("Enter The List Values :");
		for (int i = 0; i < range; i++) {
			int num = sc.nextInt();
			list01.add(num);
		}
		System.out.println("The ArrayList are :" + list01);

		for (int i = range - 1; i >= 0; i--) {
			list02.add(list01.get(i));
		}

		System.out.println("The Reversed List is :" + list02);

		int flag = 0;
		for (int i = 0; i < range; i++) {
			if (list01.get(i) == list02.get(i)) {
				flag++;
			} else
				flag = 0;
		}
		if (flag == 0) {
			System.out.println("Not a Palindrome");
		} else
			System.out.println("It is Palindrome!");

		sc.close();
	}

}
