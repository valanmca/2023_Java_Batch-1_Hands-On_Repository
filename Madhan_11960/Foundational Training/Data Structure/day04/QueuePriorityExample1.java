package com.madhan.day04;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class QueuePriorityExample1 {

	public static void main(String[] args) {
		
		Queue<Integer> queue =new PriorityQueue<Integer>();
		queue.offer(70);
		queue.offer(50);
		queue.offer(30);
		queue.offer(80);
		queue.offer(70);
//		queue.offer(null);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
	}

}
