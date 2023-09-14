package com.sara.assignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		System.out.println("Enter The List Size : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter The Elements : ");
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			list1.add(element);

		}
		System.out.println("The Elements in the List : " + list1);
		System.out.println("Enetr The Element to Search : " );
		int element = sc.nextInt();
		boolean result = false;
		for (int i = 0; i < size; i++) {
			if (list1.get(i) == element) {
				System.out.println("The Element present at "+i+" th index");
				result = true;
			
			}
		}

		if (result == false) {
			System.out.println("-1");
		}
		

		
		

	}

}
