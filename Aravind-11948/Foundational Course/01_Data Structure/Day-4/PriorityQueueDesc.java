package com.aravind.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

public class PriorityQueueDesc {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		queue.offer("C");// inserting element using offer
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println(queue);// [D,C,B,A]
		queue.poll();// remove A

		System.out.println(queue);// C,B,A]

		queue.poll();// remove C

		System.out.println(queue);// [B,A]
	}

}
