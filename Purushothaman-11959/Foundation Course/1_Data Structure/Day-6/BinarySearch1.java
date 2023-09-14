package com.purushoth.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("No of elements in list: ");
		int a = sc.nextInt();
		System.out.println("The elements are: ");
		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list is:" + list);

		list.sort(null);
		System.out.println("The sorted list is:" + list);

		System.out.println("Enter the no to search: ");
		int search = sc.nextInt();
		int count = 0;
		for (int i = 0; i < a; i++) {
			int beg = i;
			int end = a - 1;
			int mid = (beg + end) / 2;
			int k=list.get(i);
			while (k == search) {
				System.out.println("The value is found "+k+" in the index: "+i);
				if (k > search) {
					beg = mid + 1;
					mid = (beg + end) / 2;
				} else if (k < search) {
					end = mid - 1;
					mid = (beg + end) / 2;
				}
				count++;
				break;
			}
			}
		  if (count == 0) {
			System.out.println("The element is not found");

		}

	}

}//Binary search using list
