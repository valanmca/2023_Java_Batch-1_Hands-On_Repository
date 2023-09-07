package com.jeyavel.day2;

import java.util.*;

public class linkedlistTask3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();// Empty
		          //<Integer> is a predefined class. so w want to create object
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//Enitelizing the Scanner 
		System.out.println("Enter the Size of the Array ");

		int length = sc.nextInt();

		System.out.println("Enter The Elements of the Array");
		for (int i = 0; i < length; i++) {
			int temp = sc.nextInt();// size

			list.add(temp); // Append the values to the list
		}

		System.out.println("Elements in the Arraylist" + "\n" + list);
		for (int i = 0; i < length; i++) {
			int num = list.get(i);
			int count = 0;
			while (num != 0) {
				num = num / 10;
				count++;

			}
			System.out.println("Total no of digits in " + list.get(i) + "   : " + count);
		}

	}
}
