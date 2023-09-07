//Searching the given element from the Dequeue
package com.pravinkumar.day4;

import java.util.Queue;
import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Deque_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> queue = new LinkedList<Integer>();
		Deque<Integer> queues = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Numbers:");
		int Num = sc.nextInt();

		System.out.println("Enter the Numbers:");
		int temp = 0;
		for (int i = 0; i < queue.size(); i++) {
			temp = sc.nextInt();
		}
		System.out.println("The Inputs Numbers are: " + temp);
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		queue.offer(count);
		System.out.println("The Count is: " + ":" + count);
	}

}
