package com.jeban.day4;
import java.util.Queue;
import java.util.LinkedList;


public class Queue2 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.offer("cat");
		queue.offer("dog");
		queue.offer("lion");
		queue.offer("tiger");
		queue.offer("elephant");
		System.out.println(queue);
		int count=0;
		while(!queue.isEmpty()) {
			queue.poll();
			count++;
			
		}
		System.out.println("Total elements in Queue:"+ count);

	}

}
