package com.domnic.assignment;
//Given an element, how do you find out whether that element exists in a LinkedList or not. If it exists, retrieve the position of that element else return -1.

import java.util.ArrayList;
import java.util.Scanner;

public class Assg4_15_7_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the size of Arraylist :");
		int n = sc.nextInt();
		System.out.println("Enter the Elements :");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Enter the element to be found :");
		int num = sc.nextInt();
		int temp = -1;
		int index=0;
		for (int i = 0; i < n; i++) {
			if (list.get(i) == num) {
				temp = 1;
				index=i;
				
			}
		}
		if (temp == -1)
			System.out.println(num + " is not present(-1) ");
		else
			System.out.println(num + " is present in the index "+index);

	}

}
