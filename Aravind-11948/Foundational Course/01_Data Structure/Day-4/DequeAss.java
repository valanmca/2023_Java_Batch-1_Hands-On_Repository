package com.aravind.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class DequeAss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<String> queue = new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);

		System.out.println("enter the value of n");
		String n = sc.next();

		int temp = 0;
		while (!queue.isEmpty()) {
			temp = 0;
			String str = queue.pollLast();
			if (n.equals(str)) {
				temp = 1;
				break;
			} else {
				temp = 0;
			}

		}
		if (temp == 1) {
			System.out.println("value is found");
		} else {
			System.out.println("value is not found");
		}

	}

}
