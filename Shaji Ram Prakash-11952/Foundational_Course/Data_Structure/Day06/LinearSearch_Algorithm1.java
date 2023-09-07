package com.shaji.Day06;

import java.util.Scanner;
import java.util.ArrayList;
// Linear Search Algorithm - ArrayList

public class LinearSearch_Algorithm1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('B');
		list.add('E');
		list.add('A');
		list.add('F');
		list.add('H');
		list.add('K');

		System.out.println("Enter the Character to search : ");
		Scanner sc = new Scanner(System.in);
		int s = sc.next().charAt(0);
		sc.close();

		boolean isPresent = false;
		for (int i = 0; i < list.size(); i++) {
			if (s == list.get(i)) {
				System.out.print("Character Present in the index : " + i);
				isPresent = true;
				break;
			}
		}

		if (isPresent == false)
			System.out.println("Character is Absent...");
	}

}
