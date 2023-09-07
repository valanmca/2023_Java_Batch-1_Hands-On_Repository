
//PriorityQueue in Descending
package com.shiva.day04;

import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDescend {

	public static void main(String[] args) {
		
		Queue<String> queue=new PriorityQueue<String>(Comparator.reverseOrder());
		//Inserting Element at end/rear
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
//		queue.offer(null); null pointer exception
		System.out.println("Priority element will be first :"+queue);//[D, C, A, B]
		
		queue.poll();// Remove D 
		System.out.println(queue); //[C, B, A]
		
		queue.poll(); // Remove C
		System.out.println(queue);//[B, A]
	}

}
