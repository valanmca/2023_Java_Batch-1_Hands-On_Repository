package com.swetha.day4;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
public class DescPriority {

	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue<String>(Comparator.reverseOrder());
		
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		System.out.println("The queue elements are : "+queue);  //[D,C,B,A]
		
		
		queue.poll();
	    System.out.println(queue);    //Remove D......[C,B,A]
	    
	    queue.poll();
	    System.out.println(queue);    //Remove c......[B,A]

	}

}
