package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountQueue {

	public static void main(String[] args) {

		Queue<Integer> inputQueue = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the queue : ");
		int range = sc.nextInt();

		System.out.println("Enter queue elements : ");
		for (int i = 0; i < range; i++) {
			int num = sc.nextInt();
			inputQueue.offer(num);
		}

		System.out.println("\nInput Queue : " + inputQueue);

		Queue<Integer> outputQueue = new LinkedList<Integer>();
		for (int i = 0; i < range; i++) {
			int count = 0;
			int get_num = inputQueue.poll();
			while (get_num != 0) {

				get_num = (get_num / 10);
				count++;

			}
			outputQueue.offer(count);
		}

		System.out.println("\nOutput Queue : " + outputQueue);

	}

}
