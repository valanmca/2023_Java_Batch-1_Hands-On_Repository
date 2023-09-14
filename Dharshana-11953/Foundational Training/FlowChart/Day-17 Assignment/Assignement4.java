package com.dharshu.ass;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignement4 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter the number :");
		int list_size = sc.nextInt();
		System.out.println("Enter the " + list_size + " of the element:");
		
		for (int i = 0; i < list_size; i++) {
			int num1 = sc.nextInt();
			list.add(num1);
		}
		System.out.println("The elements in an list is:" + list);
		System.out.println("The element to search");
		int search = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < list_size; i++) {
			if (list.get(i) == search) {
				temp = 1;
				System.out.println("The index of the searched element is:" + i);
				break;
			}
		}
		 if(temp==0) {
			System.out.println("-1");
		}
	}
}
