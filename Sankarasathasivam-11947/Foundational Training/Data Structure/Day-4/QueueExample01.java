
//Find the Queue size without using size()

package com.shiva.day04;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample01 {

	public static void main(String[] args) {
		
		Queue<String> queue=new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println("Disply the queue : "+queue);
		
		int count=0;
		while(!queue.isEmpty())
		{
			queue.poll();
			count++;
		}
	System.out.println("\nThe Size of the queue : "+count);
	}

}
