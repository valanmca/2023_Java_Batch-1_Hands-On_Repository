package com.swetha.day4;
import java.util.Queue;
import java.util.PriorityQueue;
public class AscPriority {

	public static void main(String[] args) {
		Queue<String>queue=new PriorityQueue<String>();
		
		//Inserting elements at the end
		queue.offer("C");
		queue.offer("B");
		queue.offer("A");
		queue.offer("D");
		
		//Printing in the order [A,C,B,D].....A has the highest priority
		System.out.println("The queue elements are : "+queue);      //[A,C,B,D]
		
		queue.poll();
		System.out.println(queue);      //Remove A ....[B,C,D]	
		
		queue.poll();
		System.out.println(queue);      //Remove C.....[C,D]
		
	
	}

}
