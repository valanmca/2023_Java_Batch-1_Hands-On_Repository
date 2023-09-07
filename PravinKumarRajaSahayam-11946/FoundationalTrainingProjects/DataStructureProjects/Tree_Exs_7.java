//Get the input from the user and store in the list and count the total number of digits and display like in the TreeMap Method for the Ascending Order 
package com.pravinkumar.day5;

import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Tree_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		System.out.println("Enter the Numbers of Digits:");
		int temp = sc.nextInt();
		for (int i = 0; i < temp; i++) {
			int lists = sc.nextInt();
			list.add(lists);
		}
		System.out.println("The List are: " + list);
		for (int i = 0; i < temp; i++) {
			int num = list.get(i);
			int count = 0;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			list1.add(count);
		}
		System.out.println("Total number of Counts are: " + list1);
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), list1.get(i));
		}
		System.out.println(map);

	}
}
