package com.matthew.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();

		// getting input size
		System.out.println("Enter the Size of array:");
		int listSize = sc.nextInt();
		
		// getting list inputs and adding it in ArrayList
		for (int i = 0; i < listSize; i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}

		// Printing the elements in the array
		System.out.println("List : " + list);

		// looping through all elements

		for (int i = 0; i < listSize; i++) {
			// logic for finding length of an element
			int num = list.get(i);
			int count = 0;
			while (num > 0) {
				num /= 10;
				count++;
			}
			System.out.println("Total no of digit in : " + list.get(i) + " : " + count);
		}
	}

}
