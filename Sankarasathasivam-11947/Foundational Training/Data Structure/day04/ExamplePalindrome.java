package com.shiva.day04;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamplePalindrome {

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the List :");

		int size = sc.nextInt();
		System.out.println("Enter the values :");
		
		for (int i = 0; i < size; i++) {
			int value = sc.nextInt();
			array.add(value);
		}
		System.out.println("The given List is : " + array);

		ArrayList<Integer> array1 = new ArrayList<Integer>();

		for (int i = size - 1; i >= 0; i--) {
			int temp = array.get(i);
			array1.add(temp);
		}
		System.out.println("The Reversal : " + array1);

		int term = 0;
		if (array.isEmpty() == true) {
			System.out.println("Palindrome");
		} else {
			
			for (int i = 0; i < size; i++) {
				term = 0;
				int x = array.get(i);
				int y = array1.get(i);
				if (x != y) {
					term = 1;
					break;
				} else {
					term = 0;
				}
			}
			if (term == 0) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			}
		}
	}

}
