package com.gayathri.day4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDescending {

	public static void main(String[] args) {

		
		/*
		 * Queue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());
		 * //ascending order priority queue.offer("E"); queue.offer("A");
		 * queue.offer("G"); queue.offer("D"); queue.offer("I");
		 * System.out.println("The initial Queue : " + queue); queue.poll();
		 * System.out.println(queue); queue.poll(); System.out.println(queue);
		 */
		 
		 
		
		  Queue<Integer> queue = new
		  PriorityQueue<Integer>(Comparator.reverseOrder());// ascending order priority
		  queue.offer(5); queue.offer(1); queue.offer(3); queue.offer(7);
		  queue.offer(2); System.out.println("The initial Queue : " + queue);
		  queue.poll(); System.out.println(queue); queue.poll();
		  System.out.println(queue);
		 

	}

}
