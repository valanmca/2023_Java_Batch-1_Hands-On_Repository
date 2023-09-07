// Count the size of the queue without using size() method.

package com.madhan.day04;
import java.util.Queue;
import java.util.LinkedList;

public class QueueAssignment1 {

	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<Integer>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		System.out.println(queue);
		int count=0;
		while(! queue.isEmpty())
		{
			queue.poll();
			count++;
		}
		System.out.println("Size of the Queue:" +count);
			

	}

}
