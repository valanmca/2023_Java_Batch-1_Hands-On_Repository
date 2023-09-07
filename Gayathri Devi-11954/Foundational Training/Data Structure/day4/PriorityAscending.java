package com.gayathri.day4;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityAscending {

	public static void main(String[] args) {
		
		Queue <String> queue =  new PriorityQueue <String> ();//ascending order priority
		queue.offer("G");
		queue.offer("A");
		queue.offer("Y");
		queue.offer("T");
		queue.offer("H");
		System.out.println("The initial Queue : "+queue);
		
		queue.poll();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);

	}

}
