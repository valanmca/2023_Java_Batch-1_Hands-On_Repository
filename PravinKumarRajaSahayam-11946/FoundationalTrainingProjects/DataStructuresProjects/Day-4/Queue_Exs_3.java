//Searching the given Element is Available yes or not
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> size = new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);

		System.out.println(queue);

		System.out.println("The Enter the Number for the Search:");
		int search = sc.nextInt();
		boolean sizes = false;
		for (int i = 0; i < queue.size(); i++) {
			if (!queue.isEmpty()) {
				queue.offer(queue.poll());
				sizes = true;
			} else if (!size.offer(queue.poll())) {
				sizes = false;
			}
		}
		System.out.println("The given number is:" + " " + search + " " + true);
		System.out.println("The given number is:" + " " + search + " " + false);
	}
}
