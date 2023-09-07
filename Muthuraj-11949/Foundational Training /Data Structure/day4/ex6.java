package com.muthu.day4;

import java.util.ArrayList;


import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		System.out.println("enter the value of list:");
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());

		}
		System.out.println(list1);// get and print

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		// reverse
		for (int i = n - 1; i >= 0; i--) {
			list2.add(list1.get(i));
		}
		System.out.println(list2);
		

		int temp = 0;
		if (list1.isEmpty() == true) {
			System.out.println("palindrome");
		} 
		else {
			for (int i = 0; i < n; i++) 
			{
				temp = 0;
				int list1val = list1.get(i);
				int list2val = list2.get(i);
				if (list1val == list2val) 
				{
					temp = 1;
				}
				else 
				{
					temp = 0;
					break;
				}
				
			}
			if (temp == 1) {
				System.out.println("palindrome");
			} else {
				System.out.println("not an palindrome");
			}
		}
		

	}
}
