package com.jeyavel.day4;
import java.util.Queue;
import java.util.LinkedList;

public class CountQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(3);
		queue.offer(2);
		queue.offer(1);
		System.out.println("the Queue Elements is " + queue);
		int u_input=0;
		while(!queue.isEmpty()) {
			queue.poll();
			u_input++;
		}
       System.out.println("The count of the given queue is="+u_input);
	}
	

}
