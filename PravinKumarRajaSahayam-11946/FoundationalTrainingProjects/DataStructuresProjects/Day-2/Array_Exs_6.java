//Find the sum of Index 2 and 3 Elements in th Array List
package com.pravinkumar.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Exs_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> number = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("The Inputs are:" + list);
		int sum = 0;
		for (int i = 2; i < list.size(); i++) {
			sum += list.get(i);
			i = 3;
			break;
		}
		System.out.println("The Sum is: " + sum);

	}

}
