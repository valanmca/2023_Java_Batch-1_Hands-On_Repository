
//Priority Queue Ascending 

package com.shiva.day04;

import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueAscend {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		//Inserting Element at end/rear
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println("Priority element will be first :"+queue);//[A, C, B, D]
		
		queue.poll();// Remove A 
		System.out.println(queue); //[B, C, D] 
		
		queue.poll(); // Remove B
		System.out.println(queue);//[C,D]
	}

}
