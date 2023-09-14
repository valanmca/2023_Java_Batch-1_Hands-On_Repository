package com.naveen.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMultiples02 {

	public static void main(String[] args) {

		ArrayList<Integer> list01 = new ArrayList<Integer>();
		ArrayList<Integer> list02 = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The List01 Values :");
		for (int i = 1; i <= 10; i++) {
			int num = sc.nextInt();
			list01.add(num);
		}

		System.out.println("The List01 are :" + list01);

		System.out.println("Enter the number to multiply with the list :");
		int n = sc.nextInt();

		for (int i = 0; i < list01.size(); i++) {
			list02.add(list01.get(i) * n);
		}
		System.out.println("The Multiplied List is :" + list02);

		sc.close();

		for (int i = 0; i < 10; i++) {
			System.out.println(list01.get(i) + " * " + n + " = " + list02.get(i));
		}
	}

}
