package com.aravind.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class PriorityQueueAsc {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();// ascending
		queue.offer("C");// inserting element using offer
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println(queue);// [A,C,B,D]

		queue.poll();// remove A

		System.out.println(queue);// [B,C,D]

		queue.poll();// remove B

		System.out.println(queue);// [C,D]

	}

}
