//Searching the Element using Dequeue in the Programs
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		System.out.println(queue);
		System.out.println("Enter the number for the Search:");
		int temp = sc.nextInt();
		boolean size = false;
		while (!queue.isEmpty()) {
			if (equal(queue.offer(queue.pollFirst()), temp)) {
				size = true;

			} else {
				System.out.println("This is Avaiable");
			}

		}
		if (size == false) {
			System.out.println("This is not Avaiable");
		}
	}

	private static boolean equal(boolean offer, int temp) {
		// TODO Auto-generated method stub
		return false;
	}

}
