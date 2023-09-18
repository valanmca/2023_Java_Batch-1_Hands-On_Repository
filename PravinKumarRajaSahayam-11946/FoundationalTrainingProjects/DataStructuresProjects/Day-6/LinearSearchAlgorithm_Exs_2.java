//Searching the Element using Linear Search Algorithm in the ArrayLists
package com.pravinkiumar.day6;

import java.util.Scanner;
import java.util.ArrayList;

// Linear Search Algorithms - ArrayList
public class LinearSearchAlgorithm_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('F');
		list.add('H');
		list.add('K');

		System.out.println("Enter the Character to Search:");
		Scanner sc = new Scanner(System.in);
		char k = sc.next().charAt(0);

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (k == list.get(i))
			{
				System.out.println("Element present in the Index : " + i);
				isPresent = true;
				break;
			}
		}
		if (isPresent == false) {
			System.out.println("Element Not Presents:");
		}
	}

}
