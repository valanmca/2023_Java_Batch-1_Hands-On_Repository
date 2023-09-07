package com.aravind.day6;

import java.util.ArrayList;// linear search in ArrayList
import java.util.Scanner;

public class ArrayListLinearSearch {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		System.out.println("Enter the list elements are");
		for (int i = 0; i < size; i++) {
			list.add(sc.next().charAt(0));
		}
		
		System.out.println("character list="+list);
		System.out.println("enter the char to be search");
		char search = sc.next().charAt(0);
		boolean ispresent = false;
		for (int i = 0; i < size; i++) {
			if (search == list.get(i))
				{
				System.out.println("element present in the index=" + i);
				ispresent = true;
				break;
			}
		}
		if (ispresent == false) {
			System.out.println("element not present");
		}

	}

}
