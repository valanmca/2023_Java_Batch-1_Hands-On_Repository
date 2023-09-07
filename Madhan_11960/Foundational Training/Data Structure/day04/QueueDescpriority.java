package com.madhan.day04;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;


public class QueueDescpriority {

	public static void main(String[] args) {
		
		Queue<Integer> queue =new PriorityQueue<Integer>(Comparator.reverseOrder());
		queue.offer(20);
		queue.offer(50);
		queue.offer(100);
		queue.offer(40);
		queue.offer(10);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
	}

}


