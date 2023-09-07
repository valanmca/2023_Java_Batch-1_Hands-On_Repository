package com.pravinkiumar.day6;

import java.util.Scanner;
import java.util.LinkedList;

public class BinarySearchAlgorithm_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		System.out.println("The given Element is the : " + arr);
		System.out.println("Enter the Element for the Searcheas:");
		int key = sc.nextInt();
		int first = 0;
		int last = 0;
		int mid = (first + last) /2;
		while (first <= last) {
			if (arr.get(mid) < key) {
				first = mid + 1;
			} else if (arr.get(mid) == key) {
				System.out.println("The given Element is Found in the Array:");
				break;
			} else {
				last = mid - 1;
			}
		}
		mid = (first + last) / 2;
		if (first > last) {
			System.out.println("The given Element is Not Found in the Arrays:");
		}
	}

}
