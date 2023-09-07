//Number of Digits in a list

package com.jeyandhan.day02;

import java.util.LinkedList;
import java.util.Scanner;

public class Day2Assignment {

	public static void main(String[] args) {

		LinkedList<Integer> inputList = new LinkedList<Integer>(); // Empty list
		LinkedList<Integer> digitCountList = new LinkedList<Integer>(); // Empty list
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the List: ");
		int size = sc.nextInt(); // size
		System.out.println("Enter the values: ");

		for (int i = 0; i < size; i++) {
			int temp = sc.nextInt(); // storing the value in temp
			inputList.add(temp); // add the values in temp to inputList
		}
		System.out.println("The elements in the list are: " + inputList); // display inputList

		for (int i = 0; i < size; i++) {
			int count = 0;
			int number = inputList.get(i); // store the value from list in number
			while (number != 0) {
				number = number / 10;
				count++;
			}

			digitCountList.add(count); // adding the number of digits in list

			System.out.println("Total number of digits in " + inputList.get(i) + ":" + count);
		}
		System.out.println("The elements in the list are: " + digitCountList); // display list
	}
}
