package com.mahesh.ds_day6;

import java.util.LinkedList;
import java.util.Scanner;

public class Search_String_LList {

	public void search_string() {
		
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		String search;
		boolean flag = false;

		System.out.println("\nEnter your input range :");
		int range = sc.nextInt();
		System.out.println("Enter " + range + " input's :");

		for (int index = 0; index < range; index++) {
			list.add(sc.next());
		}
		System.out.print("Result : " + list);
		char input;
		
		do {

			System.out.println("\nEnter your search element : ");
			search = sc.next();
			for (int index = 0; index < list.size(); index++) {
				if (search.equals(list.get(index))) {
					flag = true;

				} else {
					flag = false;
				}
			}
		
			if (flag == true) {
				System.out.println("element is found");
			} else {
				System.out.println("element is not found");
			}

			System.out.print("Do you want continue (press 1 to continue) : \n");
			input = sc.next().charAt(0);
		} while (input == '1');
	
	}

	public static void main(String[] args) {
	
		Search_String_LList class_obj = new Search_String_LList();
		System.out.print("\t\tLINEAR SEARCH USING LINKED LIST\n\t\t****** ****** ***** ****** ****");
		class_obj.search_string();

	}

}
