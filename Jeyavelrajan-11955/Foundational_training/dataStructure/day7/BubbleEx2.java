
//Bubble sort reverse order
package com.jeyavel.day7;

import java.util.Scanner;
import java.util.ArrayList;

public class BubbleEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the no Of  Elements");
		size = sc.nextInt();
		// Append The Values To The ArrayList
		for (int i = 0; i < size; i++) {
			arr.add(sc.nextInt());
		}

		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int a = arr.get(i);
				int b = arr.get(j);
				if (a < b) {
					//Missed Point 
					temp = arr.get(i);// assign temp to the arr.get(i) to get the values from the arrayList
					arr.set(i, b);
					arr.set(j, temp);

				}
			}

		}
		System.out.println("The VALUES are ");

		System.out.println(arr);

	}

}
