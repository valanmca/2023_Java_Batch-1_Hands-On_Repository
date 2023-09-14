package com.aravind.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEvenOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();

		System.out.println("enter the value of size of list");
		int size = sc.nextInt();
		System.out.println("enter list 1 values");
		for (int i = 0; i < size; i++) {
			int in = sc.nextInt();
			list.add(in);
		}
		System.out.println(list);
		LinkedList<Integer> even = new LinkedList<Integer>();
		LinkedList<Integer> odd = new LinkedList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			// int temp = list.get(i);
			// if(temp%2==0) {
			if (list.get(i) % 2 == 0) {
				even.add(list.get(i));
			} else {
				odd.add(list.get(i));
			}

		}

		System.out.println(odd);
		System.out.println(even);

	}

}
