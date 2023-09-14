package com.naveen.day6;

import java.util.ArrayList;
import java.util.Scanner;

//Linear Search for character data using ArrayList
public class SearchEx02 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('B');
		list.add('A');
		list.add('D');
		list.add('F');
		list.add('W');
		list.add('E');

		System.out.println("Enter the Character to Search :");
		Scanner sc = new Scanner(System.in);
		char k = sc.next().charAt(0);
		

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k == list.get(i)) {
				System.out.println("Element present in the Index : " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element Not present");
		}
		sc.close();
	}

}
