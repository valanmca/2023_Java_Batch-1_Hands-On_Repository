package com.swetha.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// Getting an array of n numbers, count number of digits in each element of an
		// array store it in another array

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements in the list : ");
		int n = sc.nextInt(); // how many numbers in the list

		// Getting list values from user
		System.out.println("Enter list elementa : ");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list1.add(num);
		}
		System.out.println("The List are : " + list1);
		
       //Counting number of digits in each element in the array,storing in list2
		for (int i = 0; i < n; i++) {
			int count = 0;
			int value = list1.get(i);
			while (value != 0) {
				value = value / 10;
				count++;
			}
			list2.add(count);
		}
		System.out.println("NUmber of digits in each element are : " + list2);

		for (int i = 0; i < n; i++) {
			System.out.println("Total number of digits in " + list1.get(i) + " : " + list2.get(i));
		}

	}
}
