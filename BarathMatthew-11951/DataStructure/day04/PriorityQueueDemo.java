package com.matthew.day04;
import java.util.Queue;
//import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> queue =new PriorityQueue<String>();
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println("Printing the full queue"+queue);
		queue.poll();
		System.out.println("Printing the queue after poll"+queue);

		queue.poll();
		System.out.println("Printing the queue after poll"+queue);
	}

}
