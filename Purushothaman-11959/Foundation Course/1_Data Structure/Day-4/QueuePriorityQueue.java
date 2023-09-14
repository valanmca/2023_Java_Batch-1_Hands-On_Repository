package com.purushoth.day4;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new PriorityQueue<Integer>();
		Queue<Integer> queue1 =new PriorityQueue<Integer>(Comparator.reverseOrder());
		queue.offer(89);
		queue.offer(69);
		queue.offer(7);
		queue.offer(10);
		queue.offer(40);
		System.out.println("The Queue: "+queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue1.offer(7);
		queue1.offer(84);
		queue1.offer(98);
		queue1.offer(75);
		queue1.offer(63);
		System.out.println("The Queue1: "+queue1);
		
		queue1.poll();
		System.out.println(queue1);
		
		queue1.poll();
		System.out.println(queue1);
		

	}

}// Priority Queue.
