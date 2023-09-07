package com.naveen.day6;

import java.util.LinkedList;
import java.util.Scanner;

//Linear Search for String data using LinkedList
public class SearchEx03 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Naveen");
		list.add("Pravin");
		list.add("Arun");
		list.add("Vimal");
		list.add("Prabu");
		list.add("Ram");

		System.out.println("Enter the String to Search :");
		Scanner sc = new Scanner(System.in);
		String k = sc.next();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k.equals(list.get(i))) {
				System.out.println("String present in the Index : " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("String Not present");
		}
		sc.close();
	}

}
