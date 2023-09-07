package com.jeyavel.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchTheGivenElementsQAss2 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("queue Input:");
		int input = sc.nextInt();
		System.out.println("queue Input Are:" + input);
		for (int i = 0; i <= input; i++) {
			int input2 = sc.nextInt();
			queue.offer(input2);
		}
		boolean flag = true;
		while (!queue.isEmpty()) {
			if (input == queue.poll()) {
				System.out.println("The element is queue");
				flag = false;
				
				break;
			}
		}
		if (flag) {
			System.out.println("The no is not present in the list:" + flag);
		}
	}

	}

